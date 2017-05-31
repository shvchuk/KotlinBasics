package simplebasics

fun main(args: Array<String>) {

    val myName = "Andrew Shvchk"

    val longStr = """This is a long string"""

    var firstName: String = "John"
    var lastName: String = "Smith"

    var fullName = firstName + " " + lastName

    println("Name: $fullName")

    println("1 + 2 = ${1 + 2}")

    println("String Length: ${longStr.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    println("Strings Equal: ${str1.equals(str2)}")

    println("Compare A to B: ${"A".compareTo("B")}")

    println("Contains random: ${str1.contains("random")}")



}

