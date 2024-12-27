fun main(args:Array<String>) {

    for(item in 1..10)
    {
        if (item==5){
            break
        }
        println("Count: $item")
    }
    println("End of 1st Loop")
    for(item in 1..10)
    {
        if (item==5){
            continue
        }
        println("Count: $item")
    }
    println("End of 2nd Loop")
}