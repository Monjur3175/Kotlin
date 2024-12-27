
fun main(args:Array<String>) {
   var arrayInt=Array<Int>(5){0}
    arrayInt[3]=5
    println("Array[3]="+arrayInt[3])
    println("All Elememt by object")
    for (element in arrayInt)
    {
        print("$element ")//print(element)
    }
    print("\n")
    println("All Element by Index")
    for (index in 0..4)
    {
        print(arrayInt[index].toString() + " " )//println(arrayIn[index])
    }
    print("\n")
    var arraystr=Array<String>(4){""}

    for (index in 0..3)
    {
        print("arrastr[$index]=")
        arraystr[index]= readLine()!!
    }
    for (index in 0..3)
    {
        println("arraystr[$index]="+arraystr[index])
    }
}