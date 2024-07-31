import java.util.Calendar

fun main(args:Array<String>) {

    /*Input*/
    var DOB= readLine()!!.toInt()

    /*Process*/
    var currentyear= Calendar.getInstance().get(Calendar.YEAR)

    var age=currentyear-DOB
    /*Output*/
    println("Your age is $age")
}