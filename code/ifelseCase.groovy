def wenn(bedingung) {
    [dann: { statement ->
		bedingung ? statement : 0
    }]
}