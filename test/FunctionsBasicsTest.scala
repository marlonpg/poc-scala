//> using scala 3.8.3
//> using dep org.scalameta::munit::1.0.2

class FunctionsBasicsTest extends munit.FunSuite:
	test("add sums two numbers"):
		assertEquals(FunctionsBasics.add(2, 3), 5)

	test("greet supports default and custom name"):
		assertEquals(FunctionsBasics.greet(), "Hello, Guest!")
		assertEquals(FunctionsBasics.greet("Alice"), "Hello, Alice!")

	test("applyFunction works with square"):
		assertEquals(FunctionsBasics.applyFunction(FunctionsBasics.square, 6), 36)

	test("factorial computes recursively"):
		assertEquals(FunctionsBasics.factorial(5), 120)
