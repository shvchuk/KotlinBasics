package simplebasics

fun main(args: Array<String>) {

    val oneToTen = 1..10

    val alpha = "A".."Z"

    println("R in Alpha: ${"R" in alpha}")

    val tenToOne = 10.downTo(1)

    val twoTwo = 2.rangeTo(20)

    val rangeThree = oneToTen.step(3)

    for (x in rangeThree) println("rangeThree : $x")

    for(x in tenToOne.reversed()) println("Reverse: $x")
}

