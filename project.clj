(defproject aaron-santos/tinter "0.1.1"
  :description "Tinter is a color conversion and manipulation library for Clojure and ClojureScript."
  :url "http://github.com/aaron-santos/tinter"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/math.numeric-tower "0.0.1"]]

  :source-paths
  ["src"
   "target/generated-src/clj"
   "target/generated-src/cljs"]


  :cljx
  {:builds [{:source-paths ["src"]
             :output-path "target/generated-src/clj"
             :rules :clj}
            {:source-paths ["src"]
             :output-path "target/generated-src/cljs"
             :rules :cljs}]}

  :prep-tasks [["cljx" "once"]]

   :cljsbuild
  {:builds [{:id "dev"
             :source-paths ["src" "dev"]
             :compiler {:output-to "resources/public/tinter.js"
                        :output-dir "resources/public/out"
                        :optimizations :none
                        :source-map true}}]}

  :profiles {
    :dev {:dependencies []
          :plugins
          [[com.keminglabs/cljx "0.6.0"]
           [lein-cljsbuild "1.0.4"]]}})

