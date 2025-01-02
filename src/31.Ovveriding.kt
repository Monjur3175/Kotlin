open class operations1() {

    //private var processName:String?=null//private cannot be accessed from another scope
    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}
class MultiOperation1:operations1{
    constructor():super(){

    }

    override fun sum(n1: Int, n2: Int): Int {
        super.sum(n1, n2)
        return n1 + n2*3
    }
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
    var op=operations1()
    var sum=op.sum(10,15)
    println("Sum:"+sum)
    var div=op.div(12,11)
    println("Division:"+div)
    //second class inherites from first class
    var op2=MultiOperation1() as operations1
    sum=op2.sum(12,11)
    println("Sum:"+sum)
    div=op2.div(12,11)
    println("Multiplication:"+div)
}