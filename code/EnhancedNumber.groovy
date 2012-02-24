//Definition
class EnhancedNumber {
        static Number prozent(Number self, Number other) {
            other * self / 100
        }
}

//Anwendung
use(EnhancedNumber) {
	assert 10 prozent 100 == 10
}