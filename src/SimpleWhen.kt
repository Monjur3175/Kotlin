fun main(args:Array<String>) {
    var x=155
    when(x)
    {
        1,2 ->{
            println("The value is 1 or 2")
        }
        in 10..30 ->{
            println("The value is in range 10->30")
        }
        !in 10..30 ->{
            println("The value is not in range 10->30")
        }
        else->{
            println("The value is out of range")
        }
    }
}