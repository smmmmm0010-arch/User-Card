

fun main() {

    val name = "Shahd"
    val nickname: String? = null
    val age = 20

    println("Name: $name")

   
    println("Nickname: ${nickname ?: "No nickname"}")

   
    val status = if (age >= 18) "Adult" else "Minor"

    println("Age: $age")
    println("Status: $status")
}
