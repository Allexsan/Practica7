 open class Diamond(val name: String, val weight: Double, val cutQuality: Int) {
    fun calculateQ(): Double{
        return 0.4 * weight + 0.6 * cutQuality
    }
    fun printDetails(){
        println("$name - $weight - карат, $cutQuality - качество огранки")
    }
}