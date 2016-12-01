(defproject nakadi-mock-clj "0.0.1-SNAPSHOT"
  :description "Example project based on zalando/friboo"
  :url "http://example.com/FIXME"
  :license {:name "The Apache License, Version 2.0"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.zalando.stups/friboo "2.0.0-beta5"]]
  :main ^:skip-aot nakadi-mock-clj.core
  :uberjar-name "nakadi-mock-clj.jar"
  :target-path "target/%s"
  :manifest {"Implementation-Version" ~#(:version %)}
  :plugins [[lein-cloverage "1.0.9"]
            [lein-set-version "0.4.1"]]
  :aliases {"cloverage" ["with-profile" "test" "cloverage"]}
  :profiles {:uberjar {:aot :all}
             :dev     {:repl-options {:init-ns user}
                       :source-paths ["dev"]
                       :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                      [org.clojure/java.classpath "0.2.3"]
                                      [midje "1.8.3"]]}})
