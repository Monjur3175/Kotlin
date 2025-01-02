class Singleton private constructor() {
    var name: String? = null

    init {
        println("Instance is created")
    }

    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

fun main() {
    val s1 = Singleton.instance
    s1.name = "Monjur"
    println(s1.name)

    val s2 = Singleton.instance
    println(s2.name)

    // Verifying both references are the same
    println(s1 === s2) // Output: true
}
