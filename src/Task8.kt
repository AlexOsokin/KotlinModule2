fun main(args: Array<String>) {

    println("Введите сумму вклада (в рублях):")
    var sum = readLine().toString().toDouble()

    println("Введите длительность вклада (в месяцах, не менее одного):")
    val period = readLine().toString().toInt()

    println("Введите процентную ставку (от 0% до 100%):")
    val persent = readLine().toString().toInt()

    if(persent !in 0..100 || period <= 0 || sum < 0){
        println("Введенные данные не корректны!")
        return
    }

    for(i in 1..period){
        val plus = sum * persent / 100
        sum += plus
        println("За $i месяц вклад увеличился на $plus рублей и составляет $sum рублей")
    }
}
