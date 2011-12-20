(ns clojure-midje-example.core
    (:use [midje.sweet :only [unfinished]]))

(defn -main [] (println "Hello World!"))

(defn headed-pairs [element sequence]
    (map #(list element %) sequence))
(defn tails [sequence]
    (map drop 
        (range 1 (count sequence))
        (repeat sequence)))
(defn downward-pairs [sequence]
    (mapcat headed-pairs sequence (tails sequence)))
