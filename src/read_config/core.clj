(ns read-config.core
  (:refer-clojure :exclude [read])
  (:require [clojure.tools.reader.edn :refer [read]]
            [clojure.java.io :refer [reader]])
  (:import [java.io PushbackReader]))

(defn read-config [filename]
  (with-open [r (-> filename reader PushbackReader.)]
    (read r)))
