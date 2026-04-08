//> using scala 3.8.3

import java.time.LocalDate

// Unit means this function does not return a useful value, similar to void in Java.
@main
def hello(): Unit =
  //val creates an immutable value
  val language = "Scala"
  println(s"val example: $language")

  //var allows reassignment
  var level = 1
  println(s"var before change: $level")
  level = 2
  println(s"var after change: $level")

  val age: Int = 30
  val price: Double = 99.9
  println(s"number examples: age = $age, price = $price")

  val firstName = "Gamba"
  val message = s"string example: Hello, $firstName"
  println(message)

  val today = LocalDate.now()
  println(s"date example: $today")