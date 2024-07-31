fun main(args:Array<String>) {
    var n1:Int=10
    var n2:Int=10
    var n3:Int=5
    var opt:Int?
    opt=n1+n2*n3-3
    print("After Operation:$opt\n")
    opt=++n1+n2
    print("$opt\n")
    opt=n1--+n2
    println("$opt")
    opt=--n1+n2
    println("$opt")
}
/*Operation Rules
1- ()
2- ++,--(Before)
3- ^
4- *,/
5- +,-
6- =
7- ++,--(After)
 */
