fun main(args: Array<String>) {

    val table: Array<Array<String>> = Array(3) { Array(3) {"city"} }

    table[0] = arrayOf("Россия", "Украина", "Белоруссия")

    table[1] = arrayOf("Москва", "Киев", "Минск")

    table[2] = arrayOf("Рубли", "Гривны", "Белорусский рубль")

    for(i in 0 until table.count()){
        println("Страна: ${table[0][i]}; Столица: ${table[1][i]}; Валюта: ${table[2][i]}")
    }
}