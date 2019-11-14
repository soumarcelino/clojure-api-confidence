(defproject clojure-api-confidence "0.1.0-SNAPSHOT"
  :description "My first clojure api"
  :url "https://github.com/soumarcelino"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [ring/ring-defaults "0.3.2"]
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot clojure-api-confidence.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
