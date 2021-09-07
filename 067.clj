(fn prime [n]
  ((fn f [x v]
     (if (< (count v) n)
       (if (every? #(not= 0 (mod x %)) (range 2 x))
         (f (inc x) (conj v x))
         (f (inc x) v))
       v)) 3 [2]))
