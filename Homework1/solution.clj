(defn digits [n]
  (if(> n 9)
    (conj (digits (quot n 10))
          (rem n 10))
   [n])
  )
;;Problem s nachalo s 0
;;(digits 136)

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
             (cond
                 (and (prime iter) ( = (rem numb iter) 0 )) (conj (helper (quot numb iter) iter) iter)
                 (< iter numb) (helper numb (inc iter))
                 (= iter numb) [numb]
             ))]
              (helper num 2) )) ]
     (join-prime-factors n)
    ))


