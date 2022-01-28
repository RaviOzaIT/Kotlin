fun main()
{
    val fruits = listOf("Apple", "Grapes", "Banana", "Brange")

    var iter = fruits.iterator()

    println("Display - using iterator")
    // while loop to iterate through elements
    while (iter.hasNext())
    {
        println(iter.next())
    }

    // for loop to iterate though elements
    println("\nDisplay - for loop")
    for (i in fruits)
    {
        println(i)
    }
}