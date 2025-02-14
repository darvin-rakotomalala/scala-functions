/**
 * Syntax: val lambda_exp = (variable:Type) => Transformation_Expression
 * Example:
 * // lambda expression to find double of x
 * val ex = (x:Int) => x + x
 */
class LambdaExpressionDemo {

  def lambdaExpExample1(): Unit = {
    // lambda expression
    val ex1 = (x: Int) => x + 2

    // with multiple parameters
    val ex2 = (x: Int, y: Int) => x * y

    println("Result ex1 = " + ex1(7))
    println("Result ex2 = " + ex2(2, 3))
  }

  def transCollectionExample2(): Unit = {
    // list of numbers
    val l = List(1, 1, 2, 3, 5, 8)

    // squaring each element of the list
    val res = l.map((x: Int) => x * x)

    /* OR
    val res = l.map( x=> x * x )
    */
    println("Result example = " + res)
  }

  def transCollectionExample3(): Unit = {
    // list of numbers
    val l1 = List(1, 1, 2, 3, 5, 8)
    val l2 = List(13, 21, 34)

    // reusable lambda
    val func = (x: Int) => x * x

    // squaring each element of the lists
    val res1 = l1.map(func)
    val res2 = l2.map(func)

    println("Result element 1 = " + res1)
    println("Result element 2 = " + res2)
  }

  // Start - A lambda can also be used as a parameter to a function.

  // transform function with integer x and
  // function f as parameter
  // f accepts Int and returns Double
  def transform1(x: Int, f: Int => Double) = f(x)

  def printResultTransform1(): Unit = {
    // lambda is passed to f:Int => Double
    val res = transform1(2, r => 3.14 * r * r)

    println("Result transform 1 = " + res)
  }
  // End example

  // Start - transform function with collection
  // transform function with integer list l and
  // function f as parameter
  // f accepts Int and returns Double
  def transform2(l: List[Int], f: Int => Double) = l.map(f)

  def printResultTransform2(): Unit = {
    // lambda is passed to f:Int => Double
    val res = transform2(List(1, 2, 3), r => 3.14 * r * r)
    println("Result transform 2 = " + res)
  }
  // End example

}
