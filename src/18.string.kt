import java.util.*

fun main(args:Array<String>) {
    var city=" Welcome to Rajshahi"
    println("City:$city")
    println(city)
    println("City:"+city)
    var name="Monjur"+" "+"Morshed"
    println("Name:$name")
    println("8th char:"+name[7])
    println("City in uppercase:"+ city.uppercase(Locale.getDefault()))
    println("City in lowercase:"+city.lowercase())
    println("Split:"+city.split(" "))
    println("Split:"+city.trim())
}