fun displayMsg(n: Int, msg: String)
{
    var i = 1
    while(i <= n )
    {
        println(msg)
        i++
    }
}
fun sum(i: Int, i1: Int): Int {

    return i+i1
}
fun main()
{
    displayMsg(5,"hi")
    //var c = sum(10,20)
    var c = sumInt(10,20)
    println(c)
}
fun sumInt(a: Int, b: Int) = a + b