//Simple Class

//class Car(type:String,model:Int,price:Int,milesDrive:Int,owner:String){
//    init {
//        println("Type:$type")
//        println("Model:$model")
//        println("Price:$price")
//        println("MilesDrive:$milesDrive")
//        println("Owner:$owner")
//    }
//}
//
//fun main(){
//    val huCar=Car("BMW",2017,250000,1200,"Monjur")
//    val jeCar=Car("Lamborgini",2021,12500000,100,"Nadia")
//}

//Constructor
class Car(var type:String, var model:Int,var price:Int,var milesDrive:Int,var owner:String){
    fun getCarprice():Double{
        return this.price - (this.milesDrive.toDouble()*10)
    }
}

fun main(){
    val huCar=Car("BMW",2017,250000,1200,"Monjur")
    println("huCar:"+huCar.getCarprice())
    val jeCar=Car("Lamborgini",2021,1250000,100,"Nadia")
    println("jeCar:"+jeCar.getCarprice())
}