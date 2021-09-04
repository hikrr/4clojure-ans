(fn f [g x]
  (lazy-seq
   (cons x (f g (g x)))))
