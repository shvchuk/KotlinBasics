package simplebasics

fun main(args: Array<String>) {

    if( true is Boolean){
        print("true is boolean\n")
    }

    var letterGrade: Char = 'A'
    println("A is a Char: ${letterGrade is Char}")

    println("3.14 to Int: " + (3.14.toInt()))

    println("A to Int: " + ('A'.toInt()))

    println("66 to Char: "+ 66.toChar())
}

