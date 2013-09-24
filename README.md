read-config
===========

a Clojure function that reads and .edn file relative to the project directory

## Usage

in your project.clj:

```clojure
[read-config "0.1.0"]

```

## Examples 

```clojure

(require '[read-config.core :refer [read-config])

(read-config "your-data.edn")

```
