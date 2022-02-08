// www.raviroza.com
// 26-Jan-2022, 4.00 pm
fun main()
{
    print("What is your answer to life? : ")
    var response:Int? = readLine()?.toInt()
    val message = when(response){
        32 -> "Very good, and thanks for the all wish"
        33, 34, 35 -> "either 33,34 or 35"
        in 51 .. 100 -> "fifty one to one hundred"
        else -> "Sorry ! It Not what I'm looking forward to"
    }
    println(message)
}
//fun main()
//{
//    print("Enter Day Number: ")
//    var day = readLine()!!
//    var msg =
//    when (day.toInt()) {
//        1 -> "Sunday"
//        2 -> "Monday"
//        3 -> "Tuesday"
//        4 -> "Wednesday"
//        5 -> "Thursday"
//        6 -> "Friday"
//        7 -> "Saturday"
//        else -> "Invalid day number"
//    }
//    println(msg)
//}
/*fun main()
{
    print("Enter Day Number: ")
    var day = readLine()!!
    when (day.toInt()) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid day number")
    }
}*/
