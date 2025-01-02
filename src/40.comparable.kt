import java.util.Collections

class Person1(var name:String,var age:Int):Comparable<Person1>{
    override fun compareTo(other: Person1): Int {
        return this.age-other.age
    }
}
fun main(){
    var listOfNames=ArrayList<Person1>()
    listOfNames.add(Person1("Monjur",3))
    listOfNames.add(Person1("Morshed",1))
    listOfNames.add(Person1("Osama",28))
    println("Before Sort")
    for (person in listOfNames)
    {
        println("Name:"+person.name)
        println("Name:"+person.age)
    }
    Collections.sort(listOfNames)
    println("After Sort")
    for (person in listOfNames)
    {
        println("Name:"+person.name)
        println("Name:"+person.age)
    }
}