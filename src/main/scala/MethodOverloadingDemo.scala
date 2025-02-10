/**
 * Scala can distinguish the methods with different method signatures. i.e.
 * the methods can have the same name but with different parameter list
 * (i.e. the number of the parameters, the order of the parameters, and data types of the parameters)
 * within the same class.
 */
class MethodOverloadingDemo {

  // Start example 1 - By changing the number of parameters.
  // function 1 with two parameters
  def funcExample1(p: Int, q: Int): Unit = {
    var sum = p + q;
    println("Sum in function 1 is:" + sum);
  }

  // function 2 with three parameters
  def funcExample1(p: Int, q: Int, r: Int): Unit = {
    var sum = p + q + r;
    println("Sum in function 2 is:" + sum);
  }
  // End example 1

  // Start example 2 - By changing the Data types of the parameters
  // Adding three integer elements
  def funcExample2(p: Int, q: Int, r: Int): Unit = {
    var Sum = p + q + r;
    println("Sum in function 1 is:" + Sum);
  }

  // Adding three double elements
  def funcExample2(p: Double, q: Double, r: Double): Unit = {
    var Sum = p + q + r;
    println("Sum in function 2 is:" + Sum);
  }
  // End example 2

  // Start example 3 - By changing the Order of the parameters
  // Function 1
  def funcExample3(name: String, No: Int): Unit = {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + No);
  }

  // Function 2
  def funcExample3(No: Int, name: String): Unit = {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + No);
  }
  // End example 3

  /*
  // Start example 4 - What happens when method signature is same and the return type is different?
  /**
   * The compiler will give error as the return value alone is not sufficient for the compiler
   * to figure out which function it has to call. Only if both methods have different parameter
   * types (so, they have the different signature), then Method overloading is possible.
   */

  // function 1
  def funcExample4(p: Int, q: Int): Int = {
    var Sum: Int = p + q;
    return Sum;

  }

  // function 2
  def funcExample4(p: Int, q: Int): Double = {
    var Sum: Double = p + q + 3.7;
    return Sum;
  }
  // End example 4

  */

}
