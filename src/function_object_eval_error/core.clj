(ns function-object-eval-error.core)

;; 1. Caused by java.lang.IllegalArgumentException
;; No matching ctor found for class
(let [y 1
      f (fn [x] (+ x y))]
  (eval `(~f 1)))

;; solution
(let [y 1
      f (fn [x] (+ x y))]
  ((eval `(fn [g#] (g# 1))) f))
