open class Cable(val tip: String, val colichestvoJilCable: Int, val diametres: Double) {
  open fun printDetails(){
        println("$tip - $colichestvoJilCable - кол - во жил кабеля, $diametres - диаметр кабеля в сантиметрах")
    }
    open fun calculateQ(): Double{
        return diametres / colichestvoJilCable
    }

}