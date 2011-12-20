(ns clojure-midje-example.test.core
  (:use [clojure-midje-example.core])
  (:use [clojure.test])
  (:use [midje.sweet]))

(deftest the-simplest-test-you-can-write
  (is 3 (+ 1 2)))
(fact (+ 1 2) => 3)
