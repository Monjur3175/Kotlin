import java.io.FileReader
import java.io.FileWriter

fun main() {
    println("1-for read\n2-write\n")
    val op = readLine()!!.toInt()
    when (op) {
        1 -> {
            ReadfromFile()
        }

        2 -> {
            print("Enter a name you want to save in file:")
            var str: String = readLine().toString()
            WriteToFile(str)
        }
    }


}

fun WriteToFile(str: String) {
    try {
        val fo = FileWriter("text.txt", true)
        fo.write(str + "\n")
        fo.close()
        println("Data is Saved")
    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun ReadfromFile() {
    try {
        val fin = FileReader("text.txt")
        var c: Int
        do {
            c = fin.read()
            print(c.toChar())
        } while (c != -1)
    } catch (ex: Exception) {
        println(ex.message)
    }

}