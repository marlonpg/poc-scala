//> using scala 3.8.3

object VariablesBasics:
	val language: String = "Scala"
	val firstName: String = "Gamba"

	def nextLevel(current: Int): Int =
		current + 1

	def greeting(name: String): String =
		s"string example: Hello, $name"

object FunctionsBasics:
	def add(a: Int, b: Int): Int =
		a + b

	def greet(name: String = "Guest"): String =
		s"Hello, $name!"

	def square(x: Int): Int =
		x * x

	def applyFunction(f: Int => Int, value: Int): Int =
		f(value)

	def factorial(n: Int): Int =
		if n == 0 then 1
		else n * factorial(n - 1)
