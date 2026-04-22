//> using scala 3.8.3

// A sealed trait means all implementations must be declared in this file.
// This helps the compiler check pattern matches more safely.
sealed trait PaymentMethod
case object Cash extends PaymentMethod
case class CreditCard(number: String) extends PaymentMethod
case class Pix(key: String) extends PaymentMethod

sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape

@main
def sealedTraits(): Unit =
    println("Sealed Traits in Scala")

    def paymentLabel(method: PaymentMethod): String = method match
        case Cash => "Paying with cash"
        case CreditCard(number) => s"Paying with credit card ending in ${number.takeRight(4)}"
        case Pix(key) => s"Paying with PIX key: $key"
    
    def area(shape: Shape): Double = shape match
        case Circle(radius) => math.Pi * radius * radius
        case Rectangle(width, height) => width * height

    println(paymentLabel(Cash))
    println(paymentLabel(CreditCard("1234567812345678")))
    println(paymentLabel(Pix("gamba@email.com")))

    println(s"Circle area = ${area(Circle(2.0))}")
    println(s"Rectangle area = ${area(Rectangle(3.0, 4.0))}")