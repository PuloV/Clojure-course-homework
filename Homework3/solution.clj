;;(def snake (merge snake {:location (conj (:location snake) [1 2])})) ;; add location [1 2]
;;(map (fn [x] (inc(last x))) [[3 4] [3 5] [3 6] [3 7]]) ;; move by y

;;(defn move
;;  "This function makes the snake moves (rofl)"
;;  [snake]
;;  (merge snake {:location (conj (:location snake) [1 2])})
;;  )
;; REAL
(defn get-directions
  "gets the direction of a single snake cell"
  [cell1 cell2]
  [(-(first cell2) (first cell1))
   (-(last cell2) (last cell1))])
;; REALv0.0.2

(defn head
  "Returns the head of the snake."
 [snake]
  (last (:location snake)))

(defn increment-snake-cell
  "Incremets a cell of the snakes body with x and y (directions) ."
  [cell [x y]]
  [(+ (first cell) x)
  (+ (last cell) y)])

(defn moving
  "The snake is moving God save us. :D
  This function moves the snake with one cell towards its direction without checking this cell"
  [snake]
  (->> snake
    (:location)
    (next)
    ((fn [tail] (conj (reverse tail) (increment-snake-cell (head snake) (:dir snake)))))
    (reverse)
    (into [] )
    (hash-map :location)
    (merge snake)
    ))

(defn snake-grows
  "Returns a new snake wich is one cell biger then the old one.
  This function doesnt checks anything !"
  [snake]
  (merge snake {:location (conj (:location snake) (increment-snake-cell (head snake) (:dir snake)))}))

(defn change-direction
  "Creates a new snake with changed direction and the old params (:location :width :height :prizes)"
  [snake new-direction]
  (merge snake {:dir new-direction}))

(defn turn
  "The snake is moving on a direction. The function evals the direction and passes
  the result to the change-direction function.
  If the direction is unknown , there will be no changes to the snake."
  [snake direction]
  (cond
    (= direction :left) (change-direction snake [-1 0])
    (= direction :right) (change-direction snake [1 0])
    (= direction :top) (change-direction snake [0 1])
    (= direction :bottom) (change-direction snake [0 -1])
    :else snake
    ))

(defn dies?
  "Evals snakes current possition and determines if the snake will die on its next move by crashing into wall."
  [snake height width]
  (let [head (head (snake-grows snake))
        bites-tail (filter (fn [x] (= x head )) (:location snake))]
    (if (or
      (= (first head) height)
      (= (last head) width)
      (not (empty? bites-tail)))
      true
      false)))

  ;; Da pogledna let-if
(defn danger?
  "Evals snakes current possition and determines if there is a danger to crash in two moves."
  [snake]
  (let [snake+1 (snake-grows snake)]
    (if (or
      (dies? snake (:height snake) (:width snake))
      (dies? snake+1 (:height snake+1) (:width snake+1)))
      true
      false)))

(defn prize?
  "Evals snakes current possition and determines if there is a prize on the next move."
  [snake]
  (let [new-snake (snake-grows snake)
        filtered-prize (filter (fn [x] (= x (head new-snake))) (:prizes snake))]
    (if (empty? filtered-prize)
      false
      true)))

(defn move
  "Checks snake next location and moves the snake , eats the prize or returns false if
  it crashes. "
  [snake]
  (cond
    (dies? snake (:height snake) (:width snake)) false
    (prize? snake) (snake-grows snake)
    :else (moving snake)
    ))