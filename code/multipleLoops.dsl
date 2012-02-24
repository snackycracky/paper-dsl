Hotel.Zimmertypen.alle { ZimmerTyp -> 
  von heute bis 3.months alleTage { Tag ->    
    
    TagesPreis = ZimmerTyp.Grundpreis 
    
    Ereignisse.alle { Ereignis -> 
    	... 
    }
  }  
}