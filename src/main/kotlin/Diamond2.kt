class Diamond2(name: String,weight: Double,cutQuality: Int, val colors: String): Diamond("Бриллиант", 12.4,70) {
    fun calculateQp(): Double{
        var q = 0.4 * weight + 0.6 * cutQuality
        when (colors) {
            "голубой" -> q += 1.0
            "желтый" -> q -= 0.5
            else -> q
        }
        return q
    }
}