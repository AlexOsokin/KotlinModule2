fun main(args: Array<String>) {

    val workplaces: MutableMap<Int, String> = mutableMapOf(1 to "Иванов Иван Иванович", 2 to "Сергеев Сергей Сергеевич", 3 to "Александров Александр Александрович")
    loop@ while (true) {
        println("""Введите номер одного из следующих действий:
        |1) Добавить рабочее место
        |2) Посмотреть рабочее места по номеру
        |3) Выход из программы
        |Ваш ответ (введите номер действия 1-3): """.trimMargin())

        when (readLine().toString()) {
            "1" -> {
                println("Введите рабочее место:")
                val workplaceId = readLine().toString().toInt()
                println("Введите ФИО сотрудника:")
                val workplaceName = readLine().toString()
                workplaces[workplaceId] = workplaceName
                println("Рабочее место сохранено")
            }
            "2" -> {
                println("Введите номер рабочего места:")
                val workplaceId = readLine().toString().toInt()
                if (workplaces.containsKey(workplaceId))
                    println("Рабочее место номер $workplaceId занимает ${workplaces[workplaceId]}")
                else
                    println("Нет информации по данному рабочему месту")
            }
            "3" -> {
                println("Программа завершает работу")
                break@loop
            }
            else -> println("Нет такого варианта ответа")
        }
    }
}