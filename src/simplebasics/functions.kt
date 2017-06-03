package simplebasics

fun main(args: Array<String>) {

    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 = ${add(5, 4)}")

    /* in a single line function you do not need a return value
    we can also set a default values
     */
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5, 4)}")

    fun sayHello(name: String) : Unit = println("Hello $name")

    sayHello("Andrew")

    val (two, three) = nextTwo(1)
    println("1 $two $three")

    println("Sum 1 to 5 = ${getSum(1, 2, 3, 4, 5)}")

    val multiply = {num1: Int, num2: Int -> num1 * num2}

    println("5 * 3 = ${multiply(5, 3)}")
}

fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num+1, num+2)
}

fun getSum(vararg nums: Int) : Int {
    var sum = 0
    nums.forEach { n -> sum += n }
    return sum
}

