(defproject hmdb "1.0.0-SNAPSHOT"
  :description "hmdb"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [midje "1.3.1"]]
  :dev-dependencies [[appengine-magic "0.4.1"]
                     [com.intelie/lazytest "1.0.0-SNAPSHOT" :exclusions [swank-clojure]]
                     [lein-midje "1.0.9"]
                     [lein-marginalia "0.7.0"]])