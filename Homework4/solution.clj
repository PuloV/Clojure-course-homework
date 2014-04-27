
(defmacro match [value & conditions]
  (let [cond-count (count conditions)
        value-seq (if-not (sequential? value) [value] value)]
  (loop [x 0
        result (list )]
    (cond  (> x (dec cond-count)) (cons 'cond result)
           (not (sequential? (nth conditions x)))
                (recur (+ x 2)
                    (->> result  (cons `~(nth conditions (+ x 1)))  (cons `(equal? ~value-seq [~(nth conditions x)]))))
            :else (recur (+ x 2)
              (->> result  (cons `~(nth conditions (+ x 1)))  (cons `(equal? ~value-seq ~(nth conditions x)))))))))


(def _ (gensym))

(defmacro equal? [x y]
  (prn x y)
  (cond
   ; (not (sequential? x)) (equal? (conj [] x) y)
   ; (not (sequential? y)) (equal? x (conj [] y))
    ;(not (and (sequential? x) (sequential? y))) (equal? (vector x) (vector y))
    ;(not= (count x) (count y)) nil
    :else (loop [lhs x
                rhs y
                result (list )]
            (cond
              (empty? (and lhs rhs)) (cons 'and result)
              (sequential? (first rhs)) (recur (next lhs) (next rhs) (->> result (cons `(equal? ~(first lhs) ~(first rhs)))))
              (= (first rhs) '_) (recur (next lhs) (next rhs) result )
              (= (first rhs) :even) (recur (next lhs) (next rhs)  (->> result (cons `(every? even? ~(first lhs)))))
              (= (first rhs) :odd) (recur (next lhs) (next rhs)  (->> result (cons `(every? odd? ~(first lhs)))))
              (= (first rhs) :fn) (recur (next lhs) (next rhs)  (->> result (cons `(fn? ~(first lhs)))))
              (= (first rhs) :str) (recur (next lhs) (next rhs)  (->> result (cons `(string?  ~(first lhs)))))
              (= (first rhs) :seq) (recur (next lhs) (next rhs)  (->> result (cons `(sequential?  ~(first lhs)))))
              (= (first rhs) :int) (recur (next lhs) (next rhs)  (->> result (cons `(integer?  ~(first lhs)))))
              :else (recur
                      (next lhs)
                      (next rhs)
                      (->> result  (cons `(= ~(first rhs)  ~(first lhs)))))))))

;    :fn - функция
;    :int - integer
;    :seq - последователност
;    :str - низ
