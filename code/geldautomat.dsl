event :KarteEinschieben
event :karteOk
event :karteFalse
event :GeldEin
event :Abbruch
event :Quittieren
event :KarteZurueck

condition :karteOk
condition :karteFalse

state :bereit do
	transitions :KarteEinschieben => :KarteCheck
end
 
state :KarteCheck do
	actions:  GUI.ZeigeBetrag wenn :karteOK,
			  null wenn :karteFalse,
	transitions :karteOk => :GeldFordern
				:karteFalse => :bereit
end

state :Geld_Fordern do
	actions :KarteZurueck wenn :Abbruch
	transitions :GeldEin => :Geld_Fordern,
				:Abbruch => :bereit,
				:Quittieren => :LadeKarte
	
end

state :LadeKarte do
	actions :Karte.LadeKarte
	transitions :KarteZurueck => :bereit
end