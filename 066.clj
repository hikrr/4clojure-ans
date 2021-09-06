(fn gcd [& nums]
  (let [s (apply min nums)
        l (apply max nums)
        r (rem l s)]
    (if (= r 0)
      s
      (gcd s r))))
