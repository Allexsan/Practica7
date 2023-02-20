class Cable2( tip: String, colichestvoJilCable: Int, diametres: Double, val opletka: Boolean): Cable("металлический", 25, 20.3) {
    fun calculateQp() {
        var P = true
        var Q = diametres / colichestvoJilCable
        if (P){
           val qp = 2 * Q
       } else {
           val qp = 0.7.toDouble() * Q
       }
        return
    }
    override fun printDetails() {
        println("$tip - $colichestvoJilCable - кол - во жил кабеля, $diametres - диаметр кабеля в сантиметрах")
    }
    override fun calculateQ(): Double {
        return diametres / colichestvoJilCable
    }
}