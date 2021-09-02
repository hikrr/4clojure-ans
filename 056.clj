#(reduce (fn [v x]
           (if (some #{x} v)
             v
             (conj v x))) [] %)
