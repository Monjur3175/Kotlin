fun main(args:Array<String>) {
    var a1=10
    var a2=20
    var max=if (a1>a2) a1 else a2
    println(max)

    var age = 30
    var isYoung=when(age){
        30->true
        else->false
    }
    println(isYoung)
}