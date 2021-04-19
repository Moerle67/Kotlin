fun main() {
   /* var myName = "Ingo"

    myName = "Moerli"
    println("Hallo "+ myName)
    */

    var myAge = 0
    var max = 12_039_812_309_487_120
    println(myAge)
    println(max)

    var myString = "Hallo Welt"

    var myString2  = "Ich bin $myAge Jahr${if (myAge != 1) 'e' else ' '} alt"
    println(myString2)

    var mobi1 = MobilTelefon("Android", "Samsung", "N20")
    mobi1.ladeBatterie(10)
    println("Ladezustand ${mobi1.ladeZustand}%.")
}

class MobilTelefon(betriebssystem: String, marke: String, modell: String){
    var ladeZustand = 50

    fun ladeBatterie(menge: Int) {
        this.ladeZustand += if (menge> 0) menge else throw IllegalArgumentException("Lademenge darf nicht kleiner Null sein")
    }
    init {

        println("Das Telefon $modell von $marke nutzt $betriebssystem als Betriebssystem.")

    }

}


