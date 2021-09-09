(fn f [s]
  (sort-by #(.toLowerCase %)
    (re-seq #"\w+" s)))
