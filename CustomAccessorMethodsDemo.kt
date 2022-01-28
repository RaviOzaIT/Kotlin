class Student
{
    var name: String=""
    get() = field
    set(value) {field=value}

}

fun main() {
    var o = Student()
    o.name="ravi r oza"
    println(o.name)
}