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

(defn fizbuz [to-num]
  (cond (= (rem to-num 15) 0) (conj (fizbuz (dec to-num)) "fizzbuzz")
        (= (rem to-num 5) 0) (conj (fizbuz (dec to-num)) "buzz")
        (= (rem to-num 3) 0) (conj (fizbuz (dec to-num)) "fizz")
        (= to-num 1) [to-num]
        :else (conj (fizbuz (dec to-num)) to-num)
        ))

(defn index-by [func l]
  (if-not (empty? l) (conj (index-by func (pop l)) {(func(last l))  (last l)})   {}))
