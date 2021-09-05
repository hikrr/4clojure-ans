(fn [f s]
  (apply merge-with (comp vec concat)
         (map (fn [x] {(f x) [x]}) s)))
