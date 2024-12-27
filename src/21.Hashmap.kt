
fun main(args:Array<String>) {
    var maps=HashMap<Int,String>()
    maps.put(1,"Monjur")
    maps.put(2,"Ornob")
    maps.put(34,"fuad")
    println(maps.get(34))
    maps.put(33,"Ahnaf")
    for (x in maps.keys)
    {
        println(maps.get(x))
    }

}