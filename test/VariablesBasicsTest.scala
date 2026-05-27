//> using scala 3.8.3
//> using dep org.scalameta::munit::1.0.2

class VariablesBasicsTest extends munit.FunSuite:
	test("language value is Scala"):
		assertEquals(VariablesBasics.language, "Scala")

	test("nextLevel increments by one"):
		assertEquals(VariablesBasics.nextLevel(1), 2)

	test("greeting builds message from name"):
		assertEquals(
			VariablesBasics.greeting("Gamba"),
			"string example: Hello, Gamba"
		)
