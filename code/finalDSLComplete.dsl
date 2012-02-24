liste = []

Hotel.Zimmertypen.alle { typ ->

  von heute bis 2.jahre alleTage { tag ->  //oder: heute bis 2.months

    tagesPreis = typ.grundpreis

    ereignisse.alle { ereignis ->

        TagInnerhalbEreignis = tag.innerhalb ereignis

        tagesPreis += wenn TagInnerhalbEreignis dann 10 prozent tagesPreis   // oder auch:  10 / tagesPreis * 100

        tageEntfernt = tage von: heute, bis: ereignis.start // oder: abstand { von heute bis ereignis.von }

        nichtvorbei = tageEntfernt > 0
        bald = tageEntfernt < 10

        lastMinuteRabatt = (tageEntfernt * 0.5).prozent tagesPreis

        tagesPreis += wenn bald und nichtvorbei dann lastMinuteRabatt
    } 
 
    freieZimmer = freieZimmer tag    // 0.5 = die hälfte aller zimmer ist belegt.

    tagesPreis += freieZimmer / gesamtzimmer * (typ.grundpreis / 3)

    wochenendaufschlag = wenn tag.wochenende dann 10 prozent tagesPreis

    tagesPreis += wochenendaufschlag

    liste << [typ.name, tag, tagesPreis]


   }

}
  
