// www.raviroza.com
// 15-Jan-2022, 4.00
class Person (_name : String) {
    var name: String

    init {
        name = _name
    }

    override fun toString():String
    {
        return name.toString()
    }
}

fun main() {

    var o = Person("raviroza.com")
    print(o.toString())
}
