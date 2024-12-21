class Person(val nm: String?)
fun main(args:Array<String>) {

    var n1:Float= readLine()!!.toFloat()
    var n2:Float= readLine()!!.toFloat()
    var sum:Float?
    sum=n1+n2
    println("Sum: "+sum)
    /*Elvis Operators*/
    val name: String? = null
    val defaultName = name ?: "Unknown"
    println(defaultName) // Output: Unknown
    /*Safe Call Operator*/
    val person: Person? = null
    val nm = person?.nm // If person is null, nm will also be null

}