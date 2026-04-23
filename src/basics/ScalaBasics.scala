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

	//Object in Scala means a singleton: only one instance exists.
	object Logger:
		def info(message: String): Unit =
			println(s"[INFO] $message")
	Logger.info("This is an info message")

	//Case classes are ideal for immutable data models.
	case class User(name: String, age: Int) {
		println("Case Classes in Scala") }

	// create instances without new (apply is generated)
	val user1 = User("Gamba", 30)
	val user2 = User("Gamba", 30)
	println(s"user1 = $user1")

	//Structural equality (compares values, not references)
	println(s"user1 == user2: ${user1 == user2}")

	//Immutability + copy for updates
	val older = user1.copy(age = 31)
	println(s"older = $older")

	case class Product(id: Int, name: String, price: Double)
	case class Circle(radius: Double)
	case class Rectangle(width: Double, height: Double)

	//Product decomposition for pattern matching
	def area(shape: Any): Double = shape match
		case Circle(r) => math.Pi * r * r
		case Rectangle(w, h) => w * h
		case _ => 0.0

	println(s"Circle area = ${area(Circle(2.0))}")
	println(s"Rectangle area = ${area(Rectangle(3.0, 4.0))}")

	//Useful in collections
	val products = List(
		Product(1, "Keyboard", 100.0),
		Product(2, "Mouse", 50.0),
		Product(3, "Monitor", 900.0)
	)
	val expensive = products.filter(_.price > 100.0)
	println(s"Expensive products = $expensive")

	//Case objects are singleton values often used with pattern matching.
	sealed trait OrderStatus
	case object Pending extends OrderStatus
	case object Paid extends OrderStatus
	case object Shipped extends OrderStatus

	def statusMessage(status: OrderStatus): String = status match
		case Pending => "Order is pending payment"
		case Paid => "Order has been paid"
		case Shipped => "Order is on the way"

	println(statusMessage(Pending))
	println(statusMessage(Paid))
	println(statusMessage(Shipped))

	println("Pattern Matching")

	// Match by type, exact value, and with guards.
	def describe(value: Any): String = value match
		// Type pattern + guard
		case n: Int if n > 0 => s"positive int: $n"
		// Exact value pattern
		case 0 => "zero"
		// Type pattern
		case s: String => s"string: $s"
		// Another exact value pattern
		case true => "boolean true"
		// Fallback (default case)
		case _ => "something else"

	println(describe(10))
	println(describe(0))
	println(describe("scala"))
	println(describe(true))

	// Destructuring a case class
	def productLabel(p: Product): String = p match
		case Product(id, name, price) => s"#$id $name -> $$${price}"
	println(productLabel(Product(10, "Desk", 250.0)))

	// Matching a list shape
	def listInfo(list: List[Int]): String = list match
		case head :: tail => s"head=$head, tailSize=${tail.size}"
		case Nil => "empty list"
	println(listInfo(List(1, 2, 3)))
	println(listInfo(Nil))

	// Matching tuples
	def tupleInfo(t: (String, Int)): String = t match
		case (name, age) => s"name=$name age=$age"
	println(tupleInfo(("Gamba", 30)))
