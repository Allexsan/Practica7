import kotlin.io.path.fileVisitor

fun main(args: Array<String>){
//    println("Вариант 12")
//    val diamond1 = Diamond("Бриллиант", 25.5, 70)
//    val diamond2 = Diamond("Круглый", 2.5, 90)
//    diamond1.printDetails()
//    diamond2.printDetails()
//    val Q = diamond1.calculateQ()
//    println("Значение Q для Алмаза: ${diamond1.name}: $Q")
//    val diamond3 = Diamond2("Бриллиант", 2.5, 65, "желтый")
//    val qp = diamond3.calculateQp()
//    println("Значение Qp для Алмаза равна ${diamond3.name}: $qp")
//
//    println("Вариант 4")
//    val cable1 = Cable("металлический", 25, 34.4)
//    cable1.printDetails()
//    val cableQ = cable1.calculateQ()
//    println("Значение Q  для кабеля равна: ${cable1.calculateQ()}")
//
//
//    val cableQp = Cable2("металлический", 23, 65.5, droplet = false)
//    val qp1 = cableQp.calculateQp()
//    println("Значение Qp для кабель ${cableQp.tip}: $qp1")

    val data = mutableListOf<Map<String, Any>>()
    while (true){
        println("Выберите действия: ")
        println("1 - Ввод новых данных")
        println("2 - Поиск данных")
        println("3 - Ввывод всех данных")
        println("4 - Фильтрация данных")
        println("5 - Удаление данных")
        println("0 - Выход")
        when(readln().toString().toInt()){
            1 -> {
                val newData = mutableMapOf<String, Any>()
                println("Введиет данные")

                print("Название алмаза: ")
                newData["name"] = readln().toString()

                print("Вес в каратах: ")
                newData["weight"] = readln().toDouble()

                print("Качество огранки в баллах: ")
                newData["cutQuality"] = readln().toInt()

                print("Цвет алмаза: ")
                newData["color"] = readln().toString()

                data.add(newData)
            }
            2 -> {
                if (data.isNotEmpty()){
                    println("Введите значение для поиска:")

                    val searchValue = readln()

                    val searchResults = data.filter { item ->
                        item.containsValue((searchValue))
                    }
                    if (searchResults.isNotEmpty()){
                        println("Результаты поиска:")

                        for (item in searchResults){
                            println("${item["name"]}, ${item["weight"]}, ${item["cutQuality"]}, ${item["color"]}")
                        }
                    } else {
                        println("Нет результатов для отображение.")
                    }
                } else {
                    println("Нет данных для поиска.")
                }
            }
            3 -> {
                if (data.isNotEmpty()){
                    println("Все данные:")

                    for (item in data){
                        println("${item["name"]}, ${item["weight"]}, ${item["cutQuality"]}, ${item["color"]}")
                    }
                } else {
                    println("Нет результатов для отображение.")
                }
            }
            4 -> {
                if (data.isNotEmpty()){
                    println("Введите условия для фильтрации:")

                    val filterCondition = readln().toInt()

                    val filteredData = data.filter { item ->
                        item.containsValue(filterCondition)
                    }
                    if (filteredData.isNotEmpty()){
                        println("Результаты фильтрации:")

                        for (item in filteredData){
                            println("${item["name"]}, ${item["weight"]}, ${item["cutQuality"]}, ${item["color"]}")
                        }
                    } else {
                        println("Нет результатов для отображение.")
                    }
                } else {
                    println("Нет данных для фильтрации.")
                }
            }
            5 -> {
                if (data.isNotEmpty()){
                    println("Введите идентификатор элемента для удаление:")

                    val idToDelete = readln()

                    val itemToDelete = data.find { item ->
                        item["id"] == idToDelete
                    }
                    if (itemToDelete != null) {
                        data.remove(itemToDelete)

                        println("Данные удалены:")
                    } else {
                            println("Элемент не найден.")
                    }
                } else {
                        println("Нет данных для удаления.")
                }
            }
            0 -> {
                return
            } else -> {
                println("Некорректная команда, попробуйте ещё раз.")
            }
        }
    }
}