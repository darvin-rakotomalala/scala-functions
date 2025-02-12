/**
 * In Scala, Repeated Method parameters are supported, which is helpful
 * when we don’t know the number of arguments a method requires.
 * This property of Scala is utilized in passing limitless parameters to a method defined.
 * Important points :
 * The methods with Repeated Parameters should have each of the parameters of same type.
 * A Repeated parameter is always the last parameter of the method defined.
 * The method defined by us, can have only one parameter as Repeated Parameters.
 */
class RepeatedMethodParametersDemo {

  // Creating a method with
  // repeated parameters
  def addTest(x: Int*): Int = {
    // Applying 'fold' method to
    // perform binary operation
    x.sum
  }

  def addExample(): Unit = {
    // Displays Addition
    println(addTest(2, 3, 5, 9, 6, 10, 11, 12))
  }

  // Creating a method with
  // repeated parameters
  def mulTest(x: Int*): Int = {
    // Applying 'product' method to
    // perform multiplication
    x.product
  }

  def mulExample(): Unit = {
    // Displays product
    println(mulTest(Array(7, 3, 2, 10): _*))
  }

  // Creating a method with
  // repeated parameters
  def showTest(x: String, y: Any*) = {
    // using 'mkString' method to
    // convert a collection to a
    // string with a separator
    "%s is a %s".format(x, y.mkString("_"))
  }

  def showStrExample(): Unit = {
    // Displays string
    println(showTest("DarvinDev", "Computer", "Sciecne", "Portal"))
  }

}
