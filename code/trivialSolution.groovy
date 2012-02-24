
liste = []

Hotel.Zimmertypen.alle { ZimmerTyp -> 
  von heute bis 3.months alleTage { Tag ->    
    
    TagesPreis = ZimmerTyp.Grundpreis 
    
    liste << [ ZimmerTyp.name, Tag, TagesPreis ]
  }  
}

/*
Ausgabe:
...
typ1, Fri Apr 06 12:14:52 CEST 2012, 95.00
typ1, Sat Apr 07 12:14:52 CEST 2012, 95.00
typ1, Sun Apr 08 12:14:52 CEST 2012, 95.00
...
typ2, Thu May 17 12:14:52 CEST 2012, 105.00
typ2, Fri May 18 12:14:52 CEST 2012, 105.00
typ2, Sat May 19 12:14:52 CEST 2012, 105.00
typ2, Sun May 20 12:14:52 CEST 2012, 105.00
typ2, Mon May 21 12:14:52 CEST 2012, 105.00
typ2, Tue May 22 12:14:52 CEST 2012, 105.00
typ2, Wed May 23 12:14:52 CEST 2012, 105.00
typ2, Thu May 24 12:14:52 CEST 2012, 105.00
...
*/