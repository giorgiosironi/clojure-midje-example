(ns clojure-midje-example.test.core
  (:use [clojure-midje-example.core])
  (:use [clojure.test])
  (:use [midje.sweet]))

(fact "downward-pairs combines each element with all the elements in its tail"
    (downward-pairs [1 2 3]) => (just [1 2] [1 3] 
                                            [2 3]
                                      :in-any-order)
    (provided
        (headed-pairs 1 [2 3]) => [ [1 2] [1 3] ]
        (headed-pairs 2 [3]) => [ [2 3] ]
        (headed-pairs 3 []) => [ ]
        (tails [1 2 3]) => [ [2 3] [3] [] ]))

