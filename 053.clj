(fn [coll]
  (or
   (->> coll
        (partition 2 1)
        (partition-by #(< (first %) (second %)))
        (filter #(< (first (first %)) (second (first %))))
        (map #(reduce (fn [a b] (concat a [(second b)])) %))
        (sort-by #(count %) >)
     (first))
    []))
