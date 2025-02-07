/**
 * The Partially applied functions are the functions which are not applied on all
 * the arguments defined by the stated function i.e, while invoking a function,
 * we can supply some of the arguments and the left arguments are supplied when required.
 * we call a function we can pass less arguments in it and when we pass less arguments
 * it does not throw an exception. these arguments which are not passed to function
 * we use underscore( _ ) as placeholder.
 *
 * Some important points:
 *      - Partially applied functions are helpful in minimizing a function which accepts
 *        many arguments to a function that accepts only some arguments.
 *      - It can replace any number of arguments defined by a function.
 *      - It is easier for users to utilize this method.
 *
 * Syntax:
 * val multiply = (a: Int, b: Int, c: Int) => a * b * c
 *
 * // less arguments passed
 * val f = multiply(1, 2, _: Int)
 */
class PartiallyAppliedFuncDemo {

  // Start example 1
  // Creating a Partially applied function
  def Book(discount: Double, costPrice: Double): Double = {
    (1 - discount / 100) * costPrice
  }

  def AppliedFuncExample1(): Unit = {
    // Applying only one argument
    val discountedPrice = Book(25, _: Double)

    // Displays discounted price of the book
    println(discountedPrice(400))
  }
  // End example 1

  // Start example 2
  // Creating a Partially applied function
  def Mul2(x: Double, y: Double): Double = {
    x * y
  }

  def AppliedFuncExample2(): Unit = {
    // Not applying any argument
    val result2 = Mul2 _

    // Displays Multiplication
    println(result2(9, 8))
  }
  // End example 2

  // Start example 3
  // Creating a Partially applied
  // function
  def Mul3(x: Double, y: Double, z: Double): Double = {
    x * y * z
  }

  def AppliedFuncExample3(): Unit = {
    // applying some arguments
    val result3 = Mul3(7, 8, _: Double)

    // Displays Multiplication
    println(result3(10))
  }
  // End example 3

  // Start example 4
  // Creating a Partially applied function
  def div(x: Double, y: Double): Double = {
    x / y
  }

  def AppliedFuncExample4(): Unit = {
    // applying currying approach
    val result4 = (div _).curried

    // Displays division
    println(result4(72)(9))
  }
  // End example 4
}
