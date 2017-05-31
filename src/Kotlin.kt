package demo

fun main(args: Array<String>){
    println("Hello, world")

    val name = "Andrew"

    var myAge = 33

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int: $smallInt")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long: " + bigLong)
    println("Smallest Long: $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double: $bigDouble")
    println("Smallest Double: $smallDouble")

    var dblNum1: Double = 1.1111111111111111
    var dblNum2: Double = 1.1111111111111111

    println("Sum: " + (dblNum1 + dblNum2))

}