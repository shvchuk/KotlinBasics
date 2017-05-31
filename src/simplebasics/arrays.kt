package simplebasics

fun main(args: Array<String>) {
    var myArray = arrayOf(1, 1.23, "John", "Andrew", 243, -23.45676)

    println(myArray[2])

    myArray[1] = 3.124

    println("Array Length: ${myArray.size}")

    println("John in Array: ${myArray.contains("John")}")

    var partArray = myArray.copyOfRange(0,2)
    println("PartArray size -> ${partArray.size}")

    var squareArray = Array(5, { x -> x * x})
    println(squareArray[2])

    var arrayOfInt: Array<Int> = arrayOf(1, 2, 3)

    var myArrayCar = arrayListOf("BMW", "AUDI", "HONDA")

    var myArrayListBike = arrayListOf("Harley")

    println(myArrayCar + myArrayListBike)
    println(myArrayCar.isEmpty())
}



