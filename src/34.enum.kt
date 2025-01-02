enum class Direction{
        NORTH,SOUTH,EAST,WEST
}

fun main(){

    var userdirection=Direction.NORTH
    if (userdirection==Direction.SOUTH)
    {
        println("He went to the south")
    }
    else
    {
        println("We don't know where he has went")
    }
}