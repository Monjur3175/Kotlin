import java.math.BigDecimal
import java.math.RoundingMode
fun main(args:Array<String>){
    var v1:Int=10
    var v2:Int?
    var v2str:String="25.33"
    var v2Float=v2str.toFloat()
    v2=v2str.toDouble().toInt()
    println(v1)
    println(v2)
    println(v2Float)

    /*For Exact Precision*/
    val x=BigDecimal(26.356666)
    val g=x.setScale(2,RoundingMode.HALF_UP)
    print(g)// Output: 26.35\

    /*For Changing String to Precised Float*/
    v2Float = BigDecimal(v2str).setScale(4, RoundingMode.HALF_UP).toFloat()
    println(v2Float)

    /*Leading Zeroes*/
    val number = 7
    val formatted = String.format("%03d", number)
    println(formatted) // Output: 007

}


