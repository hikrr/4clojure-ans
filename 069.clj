(fn mw [f & ms]
  (let [k (distinct (mapcat keys ms))]
    (reduce (fn [m item] (assoc m (ffirst item) (second (first item)))) {}
            (map (fn [x] {x (let [s (filter identity (map #(get % x) ms))]
                              (if (> (count s) 1)
                                (apply f s)
                                (first s)))}) k))))
