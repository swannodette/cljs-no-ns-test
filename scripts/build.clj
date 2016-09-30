(require '[cljs.build.api :as b])

(b/build "src"
  {:output-to "out/main.js"
   :output-dir "out"
   :optimizations :none
   :verbose true})

(System/exit 0)
