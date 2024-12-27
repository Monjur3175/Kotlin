
fun main(args:Array<String>) {
    var arraylist=ArrayList<String>()
    arraylist.add("Monjur")
    arraylist.add("Java")
    arraylist.add("Hussain")
    arraylist.add("Ahmed")
    println("First name:"+arraylist.get(0))
    arraylist.set(0,"Leya")
    println("All Element")
    for (item in arraylist)
    {
        println(item)
    }
    println("All element by index")
    for (index in 0..arraylist.size-1)
    {
        println(arraylist.get(index))
    }
    //search
    println("Find Hussain:")
    if (arraylist.contains("hussain"))
    {
        println("Found")
    }
    else
    {
        println("Not Found")
    }
}