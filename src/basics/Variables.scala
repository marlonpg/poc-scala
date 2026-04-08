object Variables:
  def main(args: Array[String]): Unit =
    println("Variables in Scala")
    println()

    val language = "Scala"
    val currentVersion = "3"
    println(s"val creates an immutable value: $language $currentVersion")

    var lessonCount = 1
    println(s"var creates a mutable variable: lessonCount = $lessonCount")
    lessonCount = lessonCount + 1
    println(s"After reassignment: lessonCount = $lessonCount")

    val age: Int = 30
    val price: Double = 19.99
    val isLearning: Boolean = true
    val initial: Char = 'G'
    println()
    println("Common types:")
    println(s"Int = $age")
    println(s"Double = $price")
    println(s"Boolean = $isLearning")
    println(s"Char = $initial")

    val name = "Gamba"
    val message = s"Hello, $name. Welcome to Scala."
    println()
    println("String interpolation:")
    println(message)

    println()
    println("Rules of thumb:")
    println("1. Prefer val by default")
    println("2. Use var only when the value must change")
    println("3. Add types explicitly when it improves clarity")

    println()
    println("Small exercise:")
    println("- Change name, age, and lessonCount")
    println("- Add a new val for your favorite number")
    println("- Print a sentence using string interpolation")