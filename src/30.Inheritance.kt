open class operations() {

    //private var processName:String?=null//private cannot be accessed from another scope
    fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}
class MultiOperation():operations(){
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}

fun main()
{
    //first class
    var op=operations()
    var sum=op.sum(10,15)
    println("Sum:"+sum)
    var div=op.div(12,11)
    println("Division:"+div)
    //second class inherites from first class
    var op2=MultiOperation()
    sum=op2.sum(12,11)
    println("Sum:"+sum)
    div=op2.div(12,11)
    println("Multiplication:"+div)
}