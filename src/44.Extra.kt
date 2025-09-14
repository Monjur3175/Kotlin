fun main(){
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
    for (i in 1..5) print("$i ")
    println()

    for (i in 5 downTo 1) print("$i ")
    println()

    for (i in 3..9 step 2) print("$i ")
    println()

    for (i in 'd'..'g') print("$i ")

}