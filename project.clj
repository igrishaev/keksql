(defproject kek "0.1.0-SNAPSHOT"

  :description
  "FIXME: write description"

  :url
  "http://example.com/FIXME"

  :license
  {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
   :url "https://www.eclipse.org/legal/epl-2.0/"}

  :dependencies
  [[selmer "1.12.56"]
   [com.github.seancorfield/next.jdbc "1.3.847"]]

  :profiles
  {:test
   {:resource-paths ["env/test/resources"]}

   :dev
   {:dependencies
    [[org.clojure/clojure "1.11.1"]]}})
