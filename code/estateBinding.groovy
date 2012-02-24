binding."Hotel" = 
new EstateDSLWrapper(
	new Estate(
		name: "Schoenhouse", 
		estateRoomTypes: [
        	new EstateRoomType(name: "typ1", grundpreis: 95),
        	new EstateRoomType(name: "typ2", grundpreis: 105)
		]
	)
);