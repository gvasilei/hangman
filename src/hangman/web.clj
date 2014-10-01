(ns hangman.web
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [hangman.core :as hangman]
            [cheshire.core :refer :all]))

(defn new-game
  []
  (generate-string (hangman/new-game!)))

(defn add-guess
  [guess]
  (generate-string (hangman/guess! guess)))

(defroutes app-routes
  (GET "/" [] (new-game))
  (POST "/guess/:guess" [guess] (add-guess guess))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/api app-routes))
