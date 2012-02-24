class EstateDSLWrapper {
    Estate estate 
    EstateDSLWrapper(Estate estate) {
        this.estate = estate
    } 
    def Zimmertypen = estate.roomTypes;
}
