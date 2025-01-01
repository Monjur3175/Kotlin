class car(){
    var type:String?=null
    var model:Int?=null
    var price:Int?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(type:String,model:Int,price:Int,milesDrive:Int,owner:String):this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }
    constructor(owner:String):this(){
        this.owner=owner
        println("constructor2")
    }
    fun getCarPrice():Double
    {
        return this.price!!-(this.milesDrive!!.toDouble()*10)
    }

}

fun main(){
    val huCar=car("BMW",2017,250000,1200,"Monjur")
    println("huCar:"+huCar.getCarPrice())
    val jeCar=car("Lamborgini",2021,1250000,100,"Nadia")
    println("jeCar:"+jeCar.getCarPrice())
    val laCar=car("Fatema")
    println("Owner:"+laCar.owner)
}