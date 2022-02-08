// www.raviroza.com
// 02-Feb-22, 4.46 pm
class Computer
{
    var name = "no name"


    var model = ""
    // explicit getter
    get()
    {
        return field
    }
    // with short declaration
    // get() = field

    // explicit setter using field Backing field
    set(value)
    {
        field=value
    }
}
fun main() {

    var pc = Computer()

    // implicit setter for name field
    pc.name = "IBM "
    pc.model = "186"

    // implicit getter for name fields
    println("${pc.name} -> ${pc.model}, is an Old Computer ")
    //IBM  -> 186, is an Old Computer
    /*
    var pcs = arrayOf(Computer(),Computer())
    pcs[0].name = "286"
    pcs[1].name = "386"
    for (x in pcs)
        println(x.name)
   */

}