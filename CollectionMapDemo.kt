// www.raviroza.com
// 27-Jan-22, 6.37 pm

fun main()
{
    // to create read only map
    val phoneBook = mapOf (1 to "ravi",2 to "amit")
    println(phoneBook)

    println(phoneBook.get(1))

    // to define mutable map from read only map
    var pb = phoneBook.toMutableMap()

    // add new element in hash map as it is mutable now
    pb[3] = "raviroza.com"

    pb.put(4,"all in one")

    // display using println
    println(pb)

    // display using for loop
    for(x in pb)
    {
        println(x)
    }
}