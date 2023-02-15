fun main(args: Array<String>){
    println("Вариант 12")
    val diamond1 = Diamond("Бриллиант", 25.5, 70)
    val diamond2 = Diamond("Круглый", 2.5, 90)
    diamond1.printDetails()
    diamond2.printDetails()
    val Q = diamond1.calculateQ()
    println("Значение Q для Алмаза: ${diamond1.name}: $Q")
    val diamond3 = Diamond2("Бриллиант", 2.5, 65, "желтый")
    val qp = diamond3.calculateQp()
    println("Значение Qp для Алмаза равна ${diamond3.name}: $qp")

    println("Вариант 4")
    val cable1 = Cable("металлический", 25, 34.4)
    cable1.printDetails()
    val cableQ = cable1.calculateQ()
    println("Значение Q  для кабеля равна: ${cable1.calculateQ()}")


    val cableQp = Cable2("металлический", 23, 65.5, opletka = false)
    val qp1 = cableQp.calculateQp()
    println("Значение Qp для кабель ${cableQp.tip}: $qp1")
}