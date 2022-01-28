class PersonNew{
    var name: String

    constructor(_name:String) {
        name = _name
    }

    override fun toString():String
    {
        return name.toString()
    }
}

// Emp class with primary constructor and default arguments
class Emp (_name:String, _empid:String = "1001") {
    val name = _name
    val empid = _empid

    override fun toString(): String {
        return "Emp(name='$name', empid='$empid')"
    }
}
class Employee
{
    var name:String = ""
    var empid:String = ""

    // Below secondary constructor doesn’t have a body;
    // Moreover, this constructor invokes another constructor, that accepts 2 arguments.
    constructor(_name: String) : this(_name,"101")

    // Below constructor takes two parameters: a name and an employee id.
    constructor(_name: String, _id:String)
    {
        name = _name
        empid = _id
    }
    override fun toString(): String {
        return "Employee(name='$name', empid='$empid')"
    }
}

fun main() {

    //var o = PersonNew("raviroza.com")
    //print(o.toString())

    var obj = Emp("ravi r oza","101@gmail.com")
    println(obj)

}