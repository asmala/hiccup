(defproject hiccup "1.0.4"
  :description "A fast library for rendering HTML in Clojure"
  :url "http://github.com/weavejester/hiccup"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [hiccup/hiccup-common "1.0.4"]]
  :plugins [[codox "0.6.4"]]
  :codox {:exclude [hiccup.compiler]
          :src-dir-uri "http://github.com/weavejester/hiccup/blob/1.0.4"
          :src-linenum-anchor-prefix "L"}
  :profiles
  {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
   :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}})
