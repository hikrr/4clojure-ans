#(reduce (fn [m x]
           (assoc m (first x) (second x))) {} (map (fn [x1 x2]
                                                     [x1 x2]) % %2))
