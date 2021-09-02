(fn [& fs]
  (fn [& args]
    (reduce (fn [v f]
           (conj v (apply f args))) [] fs)))
