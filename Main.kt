

fun main() {

    val name = "Mona"
    val nickname: String? = null
    val age = 20

    println("Name: $name")

    // null safety
    println("Nickname: ${nickname ?: "No nickname"}")

    // check age
    val status = if (age >= 18) "Adult" else "Minor"

    println("Age: $age")
    println("Status: $status")
}