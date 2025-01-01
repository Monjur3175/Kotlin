fun main()
{
    var setemenet = setOf(1,2,3,44,11,44,55,55)
    for (element in setemenet)
    {
        println(element)
    }
    var setemenetm = mutableSetOf(1,2,3,44,11,44,55,55)
    setemenetm.add(77)
    for (element in setemenetm)
    {
        println(element)
    }
}