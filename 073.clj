;; I took a peep at the answer and found this incredible answer using macros
;; my answer was based on it

;; (fn [b]
;;   (let [x #(map get b %)]
;;     (->> `(~@b ~@(apply map list b) ~(x [0 1 2]) ~(x [2 1 0]))
;;          (filter #(and (not= :e (last %)) (apply = %)))
;;          first first)))

(fn oxx [b] 
  (let [row b
        col (apply map vector b)
        diag (concat [(mapv get b [0 1 2])] [(mapv get b [2 1 0])])
        all_comb (concat row col diag)]
    (ffirst
     (filter #(not= :e (first %)) (filter #(apply = %) all_comb)))))
