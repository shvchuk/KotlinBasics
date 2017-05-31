package simplebasics

import java.util.Random

fun main(args: Array<String>) {

    for(x in 1..10){
        println("Loop: $x")
    }

    val rand = Random()
    val magicNumber = rand.nextInt(50) + 1

    var guess = 0

    println("Magic Number (before while loop) -> $magicNumber")

    while(magicNumber != guess){
        guess++
    }

    println("Magic Number (after guessing in while loop) was $guess")

    for(x in 1..20){
        if (x % 2 == 0){
            continue
        }

        println("Odd: $x")

        if(x == 15) break
    }

    var array3: Array<Int> = arrayOf(3, 6, 9)

    for (i in array3.indices){
        println("Mult 3: ${array3[i]}")
    }

    for ((index, value) in array3.withIndex()){
        println("Index: $index Value: $value")
    }

}

