(ns clojure-midje-example.core
    (:use [midje.sweet :only [unfinished]]))

(defn -main [] (println "Hello World!"))

(unfinished tails)
(defn headed-pairs [element sequence]
    (map #(list element %) sequence))
(defn downward-pairs [sequence]
    (mapcat headed-pairs sequence (tails sequence)))
