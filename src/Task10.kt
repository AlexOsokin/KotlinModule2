fun main(args: Array<String>) {

    val citiesNoRepetition: MutableSet<String> = mutableSetOf()
    val citiesRepetition: MutableList<String> = mutableListOf()

    loop@ while (true){
        println("""Введите номер одного из следующих действий:
        |1) Добавить название города в программу
        |2) Посмотреть в консоли список всех добавленных городов
        |3) Посмотреть список добавленных городов без повторений
        |4) Выход из программы
        |Ваш ответ (введите номер действия 1-4): """.trimMargin())

        when(readLine().toString()){
            "1" -> {
                println("Введите название города:")
                val city = readLine().toString()
                citiesNoRepetition.add(city)
                citiesRepetition.add(city)
                println("Город сохранен")
            }
            "2" -> {
                println("Cписок всех добавленных городов:")
                citiesRepetition.forEach { city -> println(city) }
            }
            "3" -> {
                println("Cписок добавленных городов без повторений:")
                citiesNoRepetition.forEach { city -> println(city) }
            }
            "4" -> {
                println("Программа завершает работу")
                break@loop
            }
            else -> println("Нет такого варианта ответа")
        }
    }
}