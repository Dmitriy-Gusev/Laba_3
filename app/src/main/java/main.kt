fun main(){
    //1)Работа с преобразованием строк
    val slovo1 = "Hello"
    val slovo2 = "World"
    val sl = slovo1 + slovo2 + "!"
    println(sl)

    //2)Базовая арифметика и вывод результатов в консоль
    val x = 10
    val y = 57
    val r1 = x * y
    val r2 = y / x
    println(r1)
    println(r2)
    println(x*y+x%y-x/y)

    //3)Примеры интерполяции строк
    val k = 10
    val l = 2
    val sumMessage = "Сумма чисел $k и $l равна ${k + l}"
    println(sumMessage)

    val drinks = "Сок"
    val ltr = 2
    val sumMessage2 = "Сегодня я выпил $drinks аж целых $ltr литра"
    println(sumMessage2)

    //4) Преобразование типов
    //Преобразование числа в строку
    val number = 234
    val number_string = number.toString()
    println(number_string + " - это уже строка)")

    //Преобразование строки в число
    val string = "34232"
    val string_number = string.toInt()
    println("$string_number  - это уже число")

    //5) Пример условных операторов (if else)
    val x1 = 10
    val y1 = 5
    if (x1>y1){
        println("х больше у")
    }
    else{
        println("у больше х ")
    }
    //6) Пример цикла for
    for(i in 1..10) {
        println(i)
    }
    //6) Пример цикла while
    var i = 1
    while (i <= 4) {
        println("$i")
        i++
    }
    //7) Пример создания отдельной функции
    val array = intArrayOf(1, 2, 3, 4, 5)
    printArray(array)

    //8) Пример работы с массивом
    val fruits = arrayOf("Шаурма", "Мячик", "Бургер")
    for (fruit in fruits) {
        println(fruit)
    }
}
// Отдельная функция для печати массива
fun printArray(array: IntArray) {
    for (element in array) {
        println(element)
    }
}
