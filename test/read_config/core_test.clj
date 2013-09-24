(ns read-config.core-test
  (:require [clojure.test :refer :all]
            [read-config.core :refer :all]))

(defn- test-data
  []
  (read-config "test-data.edn"))

(deftest a-test
  (testing "testing read values"
    (let [{:keys [name lastname message]} (test-data)]
      (is (= name "Daniel"))
      (is (= lastname "Meneses"))
      (is (= message "asdf")))))
