//freie Zimmer Funktion
def freieZimmer(tag) {
    BerechnungsService.freieZimmer(tag)
}
...
//übergabe der gesamtzimmer an die DSL
binding.gesamtzimmer = Estate.get("schoenhouse").estateRoomTypes*.size()

//--------------------------------------------------------------
//Benutzung dieser DSL Spracherweiterung
verfügbareZimmer = freieZimmer tag
// abhängig von der Auslastung wird ein Teil von einem Drittel der Grundkosten aufaddiert.
tagesPreis += verfügbareZimmer / gesamtzimmer * (typ.grundpreis / 3)	