/**
 * Scala Closures are functions which uses one or more free variables
 * and the return value of this function is dependent of these variable.
 * The free variables are defined outside of the Closure Function and
 * is not included as a parameter of this function.
 */
class ClosuresFuncDemo {

  /*
    Here, In above program function sum is a closure function. var a = 4
    is impure closure. the value of a is same and values of b is different.
   */
  def closureFuncExample1(): Unit = {
    var a = 4
    // define closure function
    val sum = (b: Int) => b + a

    println("Final_Sum(1) value = " + sum(1))
    println("Final_Sum(2) value = " + sum(2))
    println("Final_Sum(3) value = " + sum(3))
  }

  /*
    Here, In above example gfg is a closure. var employee is mutable variable which can be change.
   */
  def closureFuncExample2(): Unit = {
    var employee = 50

    // define closure function
    val gfg = (name: String) => println(s"Company name is $name" +
      s" and total no. of employees are $employee")

    gfg("DarvinDev")
  }

}
