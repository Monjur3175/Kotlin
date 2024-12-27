
fun main(args:Array<String>) {
    println("Enter your marks")
    var grade: Int = readLine()!!.toInt()
    if (grade >= 80) {
        println("A+")
    }
    else if (grade >= 70 && grade <= 79) {

        println("A")

    }else {
        println("Fail")
    }
    println("Your grade is $grade")
}