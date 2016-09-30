(require '[clojure.spec :as s])

(enable-console-print!)

(s/def ::number number?)

(println (s/conform ::number 1))
