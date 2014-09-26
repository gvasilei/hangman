(defproject hangman "1.0.0"
  :description "Beginners tutorial to Clojure"
  :url "https://github.com/wagjo/hangman"
  :license {:name "Eclipse Public License"}
  ;; every library used in hangman must be declared here, so
  ;; that leiningen will find it
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [incanter "1.3.0-20120120.004852-2"]
                 [seesaw "1.3.0"]
                 [compojure "1.1.9"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler hangman.web/app}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"] [ring-mock "0.1.5"]]}}
  :checksum-deps false
  :jvm-opts ["-Dswank.encoding=utf-8"]
  ;; name of main class
  :main hangman.main)
