fun main(args: Array<String>) {
    // задача 1
    val myAge = 17
    val isTeenager: Boolean = 13 < myAge && myAge < 19

    // задача 2
    val theirAge = 30 // создание константы со значением 30
    val bothTeenagers = isTeenager &&  13 < theirAge && theirAge < 19
    // задача 3
    val reader = "Sanya"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    /* Использование равенства строк */

    // задача 4
    val readerBeforeAuthor = reader > author

    // задача 5
    val myAge2 = 18
    if (13 < myAge2 && myAge2 < 19) println("Подросток") else println("Не подросток")
    // задача 6
    val answer = if (13 < myAge2 && myAge2 < 19) "Подросток" else "Не подросток"

    println(answer)

    //задача 7
    //цикл while
    var counter = 0
    while (counter < 10){
        println("counter = $counter")
        counter++
    }

    // задача 8

    var counter1 = 0
    var roll = 0
    do{
        roll = Random().nextInt(6)
        counter1++
    }while(roll != 0)
    println("После $counter1 бросков, roll равен $roll")

    // задача 9

    val range = 1..10
    for (i in range){
        println (i * i)
    }

    // задача 10

    for (i in range){
        println (Math.sqrt(i.toDouble()))
    }

    // task 11
    //исользования step 2
    var sum = 0
    for (row in 1 until 8 step 2){
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)
}