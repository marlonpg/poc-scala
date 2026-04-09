//> using scala 3.8.3

import java.time.LocalDate

// Unit means this function does not return a useful value, similar to void in Java.
@main
def basics(): Unit =

	println("Scala Basics")

	println("Variables and Values")
	// val creates an immutable value
	val language = "Scala"
	println(s"val example: $language")

	// var allows reassignment
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

	println("Functions")

	//A simple function
	def add(a: Int, b: Int): Int =
		a + b
	println(s"add(2, 3) = ${add(2, 3)}")

	//A function that returns Unit (no meaningful value)
	def printMessage(msg: String): Unit =
		println(s"Message: $msg")

	printMessage("This is a message")

	//A function with a default parameter
	def greet(name: String = "Guest"): String =
		s"Hello, $name!"
	println(greet())
	println(greet("Alice"))

	//An anonymous function (lambda)
	val square: Int => Int = x => x * x
	println(s"square(5) = ${square(5)}")

	//A higher-order function that takes another function as a parameter
	def applyFunction(f: Int => Int, value: Int): Int =
		f(value)
	println(s"applyFunction(square, 6) = ${applyFunction(square, 6)}")

	//A recursive function
	def factorial(n: Int): Int =
		if n == 0 then 1
		else n * factorial(n - 1)
	println(s"factorial(5) = ${factorial(5)}")

	println("Classes")

	class Person(val name: String, var age: Int):
		def birthday(): Unit =
			age = age + 1

		def description: String =
			s"$name is $age years old"
	val person = Person("Gamba", 30)
	println(person.description)
	person.birthday()
	println(s"After birthday: ${person.description}")
	// A trait is like an interface in Java, but it can also have concrete methods and fields.
	// Trait with both abstract and concrete members
	trait Animal:
		def name: String          // abstract
		def sound: String         // abstract
		def describe: String =    // concrete - reuses abstract members
			s"$name says $sound"

	class Dog(val name: String) extends Animal:
		def sound: String = "Woof"
	
	val dog = Dog("Rex")
	println(dog.describe)