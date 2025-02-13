/**
 * When a function is not able to produce a return for every single variable input data
 * given to it then that function is termed as Partial function. It can determine an output
 * for a subset of some practicable inputs only. It can only be applied partially to the stated inputs.
 * Some important points:
 *     - Partial functions are beneficent in understanding many inconsistent kind of Scala functions.
 *     - It can be interpreted by utilizing case statements.
 *     - It is a Trait, which needs two methods namely isDefinedAt and apply to be implemented.
 */
class PartialFuncDemo {

  // Start example 1
  /**
   * Here, two methods are defined for applying Partial function, where isDefinedAt states
   * the condition and apply performs the operation if the given condition is satisfied.
   */
  // Creating Partial function
  // using two methods
  val r = new PartialFunction[Int, Int] {

    // Applying isDefinedAt method
    def isDefinedAt(q: Int): Boolean = q != 0

    // Applying apply method
    def apply(q: Int): Int = 12 * q

  }

  def printResultExample1(): Unit = {
    // Displays output if the
    // condition is satisfied
    println("Result example 1 = " + r(10))
  }
  // End example 1

  // Start example 2 - Partial function using Case statement
  /**
   * Here, Partial function is created using case statement so, apply and isDefinedAt is not required here.
   */
  // Creating Partial function
  val d: PartialFunction[Int, Int] = {
    // using case statement
    case x if (x % 3) == 0 => x * 3
  }

  def printResultCaseStatement(): Unit = {
    // Displays output if
    // the condition is satisfied
    println("Result using Case statement = " + d(3))
    // End example 2
  }

  // Start example 3 - Partial function using orElse
  /**
   * Here, orElse will return output for which the given condition is satisfied.
   */
  // Creating Partial function1
  val M: PartialFunction[Int, Int] = {
    // using case statement
    case x if (x % 5) == 0 => x * 5
  }

  // Creating Partial function2
  val m: PartialFunction[Int, Int] = {
    // using case statement
    case y if (y % 2) == 0 => y * 2
  }

  def printResultOrElse(): Unit = {
    // chaining two partial
    // functions using orElse
    val r = M orElse m

    // Displays output for
    // which the given condition
    // is satisfied
    println("Result using orElse = " + r(5))
    println("Result using orElse = " + r(4))
  }
  // End example 3

  // Start example 4 - Partial function using Collect method
  /**
   * Here, Collect will apply Partial function to all the elements of the List and will
   * return a new List on the basis of the conditions stated.
   */
  // Creating Partial function
  val cM: PartialFunction[Int, Int] = {
    // using case statement
    case x if (x % 5) != 0 => x * 5
  }

  def printResultCollect(): Unit = {
    // Applying collect method
    val y = List(7, 15, 9) collect {
      cM
    }

    // Displays output for which
    // the given condition
    // is satisfied
    println("Result using collect = " + y)
  }
  // End example 4

  // Start example 5 - Partial function using andThen
  // Creating Partial function
  val pF: PartialFunction[Int, Int] = {
    // using case statement
    case x if (x % 4) != 0 => x * 4
  }

  // Creating another function
  val append = (x: Int) => x * 10

  /**
   * Here, andThen will append the output of Partial function
   * with the another function given and then will return that value.
   */
  def printResultAndThen(): Unit = {
    // Applying andThen method
    val y = pF andThen append

    // Displays output after
    // appending the another
    // function given
    println("Result using andThen = " + y(7))
  }
  // End example 5


}
