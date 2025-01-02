class useradmins<T>(credit:T){

    init {
        println(credit)
    }
}

fun <T>display(process:T){
    println(process)
}
fun main() {
    var useradmin1=useradmins<String>("Monjur")
    var useradmin2=useradmins<Int>(25)
    var useradmin3=useradmins<Double>(25.50)

    display<Int>(22)
    display<String>("Monjur")


}