(defn digits [n]
  (if(> n 9)
    (conj (digits (quot n 10))
          (rem n 10))
   [n])
  )

(defn prime-factors [n]
  (letfn [(prime [number]
            (letfn [(helper-prime [iter]
                  (cond (= iter number) true
                        (= (rem number iter) 0) false
                         :else (helper-prime (inc iter)))
                  )]
            (helper-prime 2)))

          (join-prime-factors [num]
            (letfn [(helper [numb iter]
             (cond (and (prime iter) ( = (rem numb iter) 0 )) (conj (helper (quot numb iter) iter) iter)
                   (< iter numb) (helper numb (inc iter))
                   (= iter numb) [numb]
             ))]
              (helper num 2) )) ]

    (if (or (= n 1) (= n 0)) [] (join-prime-factors n) )
    ))


(defn fizzbuzz [to-num]
  (cond (= (rem to-num 15) 0) (conj (fizzbuzz (dec to-num)) "fizzbuzz")
        (= (rem to-num 5) 0) (conj (fizzbuzz (dec to-num)) "buzz")
        (= (rem to-num 3) 0) (conj (fizzbuzz (dec to-num)) "fizz")
        (= to-num 1) [to-num]
        :else (conj (fizzbuzz (dec to-num)) to-num)
        ))

(defn index-by [func l]
  (if-not (empty? l) (conj (index-by func (pop l)) {(func(last l))  (last l)})   {}))

(defn harmonic [n]
  (if (= n 1) 1 (+ (/ 1 n) (harmonic (dec n))) ))

(defn densities [list]
  (letfn [( counts-accur[current-list , item-to-be-found ,acur]
            (cond (empty? current-list) acur
                  (= item-to-be-found (last current-list)) (counts-accur (pop current-list) item-to-be-found (inc acur))
                  :else (counts-accur (pop current-list) item-to-be-found acur)))
          (to-keywords [old-list , new-list]
            (if (empty? old-list) new-list
            (to-keywords (pop old-list) (conj new-list (counts-accur list (last old-list) 0)))))]
  (reverse (to-keywords list [] ))))

(defn uniquify [not-uniq-list]
  (letfn [(find-uniq[element , occurred , uniq-list]
                    (cond (not (some #(= element %) uniq-list)) element
                          (= occurred 0) (find-uniq (str element "-" (inc occurred)) (inc occurred) uniq-list)
                          :else (find-uniq (clojure.string/replace element (str "-" occurred ) (str "-" (inc occurred) )) (inc occurred) uniq-list))
                          )

          (make-uniq-list [not-uniq , uniq]
                 (cond (empty? not-uniq) uniq
                       :else  (make-uniq-list (rest not-uniq) (conj uniq (find-uniq (first not-uniq) 0 uniq)))
                  )
           )]
    (make-uniq-list not-uniq-list [])))



