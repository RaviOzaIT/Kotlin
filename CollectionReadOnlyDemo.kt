// www.raviroza.com
// 27-Jan-2022, 5.18 pm
fun main()
{
    // creating read-only list with listOf
    var readOnlyList = listOf("C","C++","C#","Java","Kotlin","www.raviroza.com")

    println("Display - using println")
    println(readOnlyList)

    println()
    println("Display - using For loop")
    for (a in readOnlyList)
    {
        println(a)
    }

}