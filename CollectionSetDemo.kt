// www.raviroza.com
// 27-Jan-2022, 5.55 pm
fun main()
{
    var cities = mutableSetOf("Jam","Raj")

    println("Cities - mutable set")
    cities.add("Jam")
    cities.add("Raj")
    cities.add("Ahm")

    println(cities)

    // creating mutable set of numbers using range
    val numbers = (1..25).toMutableSet()

    // it removes the element with odd indices
    numbers.removeIf { i -> i % 2 == 1 }

    println("\nNumbers - mutable set")
    println(numbers)


    // creating mutable set of chars using range
    val chars = ('a'..'f').toMutableSet()
    println("\nCharacters - mutable set")
    println(chars)


}