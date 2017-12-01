(ns versuch.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]



  (def likes-bekommen (Integer/parseInt (first args)))

  (defn werbung-anzeigen [] (println "bitte kaufe dir einen macbook"))

  (if (<  299 likes-bekommen)
      (werbung-anzeigen)
      (println (str "es fehlen noch "
                    (- 299 likes-bekommen)
                    " likes"
               )
      )
  )
)
