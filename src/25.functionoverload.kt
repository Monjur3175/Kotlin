fun sum(n1:Int,n2:Int):Int{
    return n1+n2
}
fun sum(n1:Int,n2:Int,n3:Int):Int{
    return n1+n2+n3
}
fun sum(n1:Int,n2:Int,n3:Int,n4:Int):Int{
    return n1+n2+n3+n4
}

fun main(){
    var sumNumber=sum(10,11)
    println("Sum="+sumNumber)
    sumNumber=sum(10,11,15)
    println("Sum="+sumNumber)
    sumNumber=sum(10,11,15,14)
    println("Sum="+sumNumber)

}
