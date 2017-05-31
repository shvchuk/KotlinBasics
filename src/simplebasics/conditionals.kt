package simplebasics

fun main(args: Array<String>) {

    val age = 8

    if(age < 5){
        println("Go to preschool")
    } else if(age == 5){
        println("Go to Kindergarten")
    } else if((age > 5) && (age <= 17)){
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to college")
    }

    when(age){
        0, 1, 2, 3, 4 -> println("Go to Preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }

    var number: Int = 22
    if(number % 2 == 0){
        println("Number $number is even")
    } else {
        println("Number $number is odd")
    }

    // Grade System
    var myScore: Int = 78
    val passingScore: Int = 40

    if (myScore > 90) {
        println("Your grade is A and your score is $myScore")
    } else if (myScore> 75){
        println("Your grade is B and your score is $myScore")
    } else if (myScore > 60){
        println("Your grade ic C, your score is $myScore")
    } else if (myScore > passingScore){
        println("Your grade is D, your score is $myScore")
    } else {
        println("You dont pass")
    }

}

