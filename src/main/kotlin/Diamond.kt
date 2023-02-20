 open class Diamond(val name: String, val weight: Double, val cutQuality: Int) {
   open fun calculateQ(): Double{
        return 0.4 * weight + 0.6 * cutQuality
    }
   open fun printDetails(){
        println("$name - $weight - карат, $cutQuality - качество огранки")
    }
 }