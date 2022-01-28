fun NamedParaDemo(name:String = "ravi r oza", city:String = "jamnagar", id:Int = 101)
{
    println("ID    : $id")
    println("Name  : $name")
    println("City  : $city")
}
fun main()
{
    NamedParaDemo(name="raviroza.com",id=201)
    NamedParaDemo(id=301,name="Oza Ravi")
}