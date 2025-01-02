abstract class creditCard(){
    fun creditID():String{
        return "25454354as"
    }
    abstract fun newcredit()
}
class UserInfo():creditCard(){
    fun getInfo():String{
        return creditID();
    }

    override fun newcredit() {
        println("new card created")
    }
}

fun main() {
//    var credit = creditCard()
//    println(credit.creditID())
    var user=UserInfo()
    println(user.getInfo())
}