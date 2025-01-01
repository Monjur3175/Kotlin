
fun sum(n1:Double,n2:Double):Double
{
    var sum=n1+n2
    return sum
}
fun display(n:Int):Unit
{
    println("n:$n")
}
fun displaynoInput():Unit{
    println("Welcome to display")
}

fun main()
{
    var r = sum(10.06,22.36)
    println("r:$r")
    display(22)
    display(100)
    displaynoInput()
}