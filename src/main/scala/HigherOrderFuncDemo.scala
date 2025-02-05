/**
 * Higher Order Function is the functions that operate with another functions
 * are known as Higher order Functions. It is worth knowing that this higher order function
 * is applicable for functions and methods as well that takes functions as parameter
 * or returns a function as a result. This is practicable as the compiler of Scala allows
 * to force methods into functions.
 */
class HigherOrderFuncDemo {

  // Defining a method
  def multiplyValue = (y: Int) => y * 3

  def higherOrderFuncExample(): Unit = {
    // Creating a list of numbers
    val num = List(7, 8, 9)

    // Creating a higher order function
    // that is assigned to the variable
    val result = num.map(y => multiplyValue(y))

    // Displays output
    println("Multiplied List is: " + result)
  }
}
