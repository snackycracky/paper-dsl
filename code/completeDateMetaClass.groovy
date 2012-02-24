use(TimeCategory) {
    Date.metaClass { 
        getWochenende = {
			date = delegate
            date[Calendar.DAY_OF_WEEK] == Calendar.SATURDAY ||
            date[Calendar.DAY_OF_WEEK] == Calendar.SUNDAY
        }
        bis = { Date bis ->
			def von = delegate
            (von..bis)
        }
    }
}