fun main()
{
    var map = hashMapOf(1 to "Monjur",2 to "Morshed")
    map.put(3,"Osama")
    println(map.get(3))
    println(map[3])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    println("Immutable List:")
    var list1= listOf(11,22,33,22)
    for (item in list1)
    {
        println(item)
    }
    println("Mutable List:")
    var list2= mutableListOf(11,22,33,22)
    list2[0]=21
    for (item in list2)
    {
        println(item)
    }
}