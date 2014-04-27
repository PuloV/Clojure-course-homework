(defn chase [n collection]
  (letfn[
    (recursive[iter]
      (cons (if (= iter 0)
        (count collection)
        (nth collection (rem (dec iter) (count collection)) "BAR")
        )
       (lazy-seq (recursive (Math/abs (rem (+ iter n) (count collection)))))))]
    (recursive n)))
