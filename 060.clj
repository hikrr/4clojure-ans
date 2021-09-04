(fn rdc
  ([f xs] (rdc f (first xs) (rest xs)))
  ([f init xs]
   (lazy-seq
    (if-not (empty? xs)
      (cons init (rdc f (f init (first xs)) (rest xs)))
      [init]))))
