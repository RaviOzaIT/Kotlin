// www.raviroza.com
// 26-Jan-2022, 4.00

fun main()
{
    forLoopDemo()
    // for loop -> Iterating a String
    /*var lang = "Android"
    for (ch in lang) {
        println(ch)
    }*/
}

fun forLoopWithArray()
{
    // for loop -> Iterating an Array
    var heros = arrayOf("amit","rajesh","dilip","raj")
    for(hero in heros)
    {
        println("$hero is a very good actor")
    }

    // for loop -> using indices to get elements
    for(hero in heros.indices)
    {
        println(heros[hero] + " is a very good actor")
    }
}

fun forLoopDemo()
{
    // for loop demo
    var i = 1
    print ("For loop demo\nE nter Limit  : ")
    var n = readLine()!!
    for (i in 1..n.toInt())
    {
        println("www.raviroza.com $i")
    }

    for(i in n.toInt() downTo 1)
    {
        println("www.raviroza.com $i")
    }
}

fun whileLoop()
{
    // while loop demo
    var i = 1
    print ("Enter Limit : ")
    var n = readLine()!!
    while (i <= n.toInt())
    {
        println("www.raviroza.com $i")
        i++
    }
}
    /*
    var zeroToTen = 0..10
    for(t in zeroToTen)
    {
        println(t)
    }
    if (9 in zeroToTen) println("9 is in zeroToTen")

     */

//}
