fun main(args:Array<String>) {
    var grade: Int = readLine()!!.toInt()
    if (grade >= 80) {
        println("A+")
    }
    else if (grade >= 70 && grade <= 79) {
        grade += 10
        println("A+")
        println("You got Extra 10 Points")
    }
        println("Your Number is $grade")
}