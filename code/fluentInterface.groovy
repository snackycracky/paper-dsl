def von(Date start) {
     [bis: { end -> 
             use(groovy.time.TimeCategory) {
                 (start..end)
             }
         }
     }]
}
