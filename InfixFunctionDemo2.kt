class MyMath
{
    // user defined infix member function
    infix fun factorial(num : Int): Int
    {
        var t = 1
        var n = num
        while(n>=1)
        {
            t = t * n
            n--
        }
        return t
    }
    infix fun evenOdd(num: Int)
    {
        if(num % 2 == 0)
            println ("$num is EVEN")

        else
            println ("$num is ODD")
    }
}
fun main()
{
    var m = MyMath()
    var x = 5
    var f = m factorial x

    println("Factorial of $x is $f")


    //various way to call infix method
    m.evenOdd(5)

    m evenOdd (7)

    m evenOdd 9

}