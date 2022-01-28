// www.raviroza.com
// 27-Jan-2022, 5.18 pm
fun main()
{
    // creating Mutable List with mutableListOf
    var mutableList = mutableListOf ("C","C++","C#","Java")


    println("Display - using println")
    println(mutableList)


    // methods to modify the list as it is a mutable list
    mutableList.set(0,"C Lang.")
    mutableList.add(2,"Swift")
    mutableList.add("Kotlin")
    mutableList.add("www.raviroza.com")

    mutableList.remove("C Lang.")
    mutableList.removeAt(2)
    
    println()
    println("Display - using For loop")

    for (a in mutableList)
    {
        println(a)
    }
    println(mutableList)
}