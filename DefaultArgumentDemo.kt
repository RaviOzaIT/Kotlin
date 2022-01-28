fun DefaultArguDemo(n: Int, msg: String="hi")
{
    var i = 1
    while(i <= n )
    {
        println(msg)
        i++
    }
}
fun main()
{
    DefaultArguDemo(4)
    DefaultArguDemo(4,"hello")
}