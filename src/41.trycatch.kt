fun main(){
    var n2:Int= readLine()!!.toInt()
    try{
        var Div=100/n2
        print("DIV:$Div")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("App is done")
}