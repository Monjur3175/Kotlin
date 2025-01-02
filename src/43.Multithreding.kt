fun main(){
    var t1=thread("Thread 1 ")
    t1.start()

    var t2=thread("Thread 2 ")
    t2.start()
    t2.join()
    println("Multithreading is Done")
}
class thread(): Thread(){
    var ThreadName:String=""
    constructor(ThreadName: String):this(){
        this.ThreadName=ThreadName
        println(this.ThreadName+"is Started")
    }
    override fun run(){
        //Write thread
        var count=0
        while (count<10){
            println(this.ThreadName+"Count:$count")
            count++
            try {
                Thread.sleep(1000)
            }
            catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}