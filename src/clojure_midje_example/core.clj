(ns clojure-midje-example.core
    (:use [midje.sweet :only [unfinished]]))

(defn -main [] (println "Hello World!"))

(unfinished headed-pairs tails)
(defn downward-pairs [sequence]
    (mapcat headed-pairs sequence (tails sequence)))
