

fun ArrayList<String>.swap(index1:Int,index2:Int){
    var temp=this.get(index1)
    this.set(index1,this.get(index2))
    this.set(index2,temp)
}
fun main(){
    var arrayList=ArrayList<String>()
    arrayList.add("Monjur")
    arrayList.add("Morshed")
    arrayList.add("Osama")
    arrayList.swap(0,1)
    println(arrayList)
}