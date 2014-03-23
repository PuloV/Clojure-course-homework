(def songs-text2
"My Favourite Things. John Coltrane. Jazz, Bebop. popular, cover
Alabama. John Coltrane. Jazz, Avantgarde.
Boplicity. Miles Davis. Jazz, Bebop
Autumn Leaves. Bill Evans. Jazz. popular
Waltz for Debbie. Bill Evans. Jazz
Pathetique. Beethoven. Classical
Fur Elise. Beethoven. Classical. popular
Toccata e Fuga. Bach. Classical, Baroque.
Eine Kleine Nachtmusik. Mozart. Classical. violin, fancy")

(require 'clojure.set)
(require 'clojure.string)

(defn make-collection [collection]
  (letfn [
    (make-song [song-params]
    (let [song  (clojure.string/split song-params #"(\.0)|(\.\s{1,})")
          formated-song {:title  (nth song 0 "") ,
                         :artist (nth song 1 "") }]
      (if-not (=(count (clojure.string/split (nth song 2 "") #"," )) 1)
       (conj formated-song
            {:genre (first (clojure.string/split (nth song 2 "") #"(,\s{0,})"))
            :subgenre (clojure.string/replace (nth (clojure.string/split (nth song 2 "") #"(,\s{0,})") 1) #"\." "")
            :tags (conj (set `())
                        (keyword (clojure.string/lower-case (nth (clojure.string/split (nth song 2 "") #"(,\s{0,})") 0)))
                        (keyword (clojure.string/lower-case (clojure.string/replace (nth (clojure.string/split (nth song 2 "") #"(,\s{0,})") 1) #"\." "") ))
                        (keyword (nth (clojure.string/split (nth song 3 "") #"(,\s{0,})") 0))
                        (keyword (nth (clojure.string/split (nth song 3 "") #"(,\s{0,})") 1 "")))  })
        (conj formated-song
              {:genre (nth song 2 "")
               :tags (conj (set `())
                           (keyword  (clojure.string/lower-case (nth song 2 "")) )
                           (keyword  (nth (clojure.string/split (nth song 3 "") #"(,\s{0,})") 0) )
                           (keyword  (nth (clojure.string/split (nth song 3 "") #"(,\s{0,})") 1 "")))}))))

  (make-songs[songs]
                    (if (seq? songs)
                      (conj (make-songs(rest songs)) (make-song (first songs)))
                      []))
          ]
  (make-songs (clojure.string/split-lines collection))))

(defn search [collection field criteria]
  (letfn[
         (search-by-criteria [collection-criteria]
          (cond (empty? collection-criteria) []
                (or (= criteria true)
                    ( = ((first (first criteria)) (first collection-criteria))
                        (last (first criteria)))
                        (and (not (instance? String ((first (first criteria)) (first collection-criteria))))
                             (clojure.core/contains?
                              ((first (first criteria))(first collection-criteria))
                              (last (first criteria)))))
                  (conj
                    (search-by-criteria (next collection-criteria))
                    (first collection-criteria))
                :else (search-by-criteria (next collection-criteria))))

         (search-by-field [collection-field]
            (if (empty? collection-field)
              (set `())
              (conj (search-by-field (next collection-field)) (field (first collection-field)))))

         (tag-search [search-collection ,new-collection]
            (if (seq? search-collection)
             (tag-search (next search-collection)
                         (clojure.set/union new-collection (first search-collection)))
              new-collection ))

         (list->set [our-list , new-set]
            (if (seq? our-list)
              (list->set (next our-list) (conj new-set (first our-list)))
              new-set)
          )

        (tag->tags [old-criteria , new-criteria]
          (cond
            (empty? old-criteria) new-criteria
            (= (first (first old-criteria)) :tag)
              (tag->tags (next old-criteria) (conj new-criteria {:tags (nth (first old-criteria) 1)}))
            :else
              (tag->tags (next old-criteria) (conj new-criteria (first old-criteria))))
         )]

   (cond
    (= criteria true) (search-by-field (search-by-criteria collection))
    (clojure.core/contains? criteria :tag) (search collection field (tag->tags criteria {}))
    (= field :tags)
      (list->set (remove #(= % (keyword ""))
                    (tag-search
                    (search-by-field (search-by-criteria collection))
                    #{}))
                  #{})

    (= (first criteria) :and )
     (clojure.set/intersection
      (search collection field (nth criteria 1))
      (search collection field (nth criteria 2)))

    (= (first criteria) :or )
      (clojure.set/union
        (search collection field (nth criteria 1))
        (search collection field (nth criteria 2)))

    (= (first criteria) :not)
      (clojure.set/difference
        (search collection field true)
        (search collection field (nth criteria 1)))

   :else (search-by-field (search-by-criteria collection))))

  )