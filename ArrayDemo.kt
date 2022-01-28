import java.util.*

// www.raviroza.com
// 28-Jan-22, 6.52 pm
// program to demonstrate various arrays in kotlin

fun main()
{

    var numbers = arrayOf (1,2,3,4,5)
    var names = arrayOf ("raviroza.com","amit","jamnagar")

    var numbers1 = intArrayOf (1,2,3,4,5)

    println(numbers[0])
    println(names[0])
    println(numbers1[0])

    var arr1 = emptyArray<String>();
    arr1 += "one"
    arr1 += "two"
    arr1 += "three"

    //arr1[3] = "four"

    println("empty array element ->")
    arr1.forEach { i-> println(i) }

    var arr = arrayOfNulls<String>(2)
    arr.set(0, "one")
    arr.set(1, "two")

    var words = arrayOf("cat", "rat", "set")

    var ints = Array<String> (3, {it.toString()})

    println(ints[0])

    var p = intArrayOf(1,2,3,4)
    var q = longArrayOf(1,2,3,4)

    var r = byteArrayOf(1,2,3,4)
    var s = shortArrayOf(1,2,3,4)

    println(Arrays.toString(p))
    println(Arrays.toString(q))
    println(Arrays.toString(r))
    println(Arrays.toString(s))

}
