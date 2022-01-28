class ExtensionTest
{
    fun method1()
    {
        println ("Regular method inside of class ")
        println ("Regular ExtensionTest.method1() called")
        println()
    }
}
fun main()
{
    fun ExtensionTest.method2()
    {
        println ("Extension method added from outside of class ")
        println ("ExtensionTest.method2() called")
        println()
    }
    var ex = ExtensionTest();
    ex.method1()
    ex.method2()
}