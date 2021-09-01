#(reduce (fn [m x]
           (if (get m x)
             (assoc m x (inc (get m x)))
             (assoc m x 1)))
         (sorted-map) %)
