(fn [n coll]
   (filter #(= (count %) n) (reduce (fn [coll a]
                                      (cond
                                        (empty? coll) (conj coll [a])
                                        (>= (count (last coll)) n) (conj coll [a])
                                        (< (count (last coll)) n) (vec (reverse (apply vector (conj (first (reverse coll)) a) (rest (reverse coll))))))) [] coll)))
