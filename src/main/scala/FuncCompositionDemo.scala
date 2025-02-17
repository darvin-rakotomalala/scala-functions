/**
 * Function composition is a way in which a function is mixed with other functions.
 * During the composition the one function holds the reference to another function in order
 * to fulfill it’s mission. There are some different ways in which a function composition
 * can take place, as below :-
 * - compose : Composing method works with val functions. Syntax :
 * (function1 compose function2)(parameter)
 * - In the above syntax function2 works first with the parameter passed & then passes
 * then returns a value to be passed to function1.
 */
class FuncCompositionDemo {

  val add = (a: Int) => {
    a + 1
  }

  val mul = (a: Int) => {
    a * 2
  }

  val sub = (a: Int) => {
    a - 1
  }

  // Start example 1

  /**
   * In this example, firstly mul function called we got 4(2 * 2)
   * than add function called and we got 5(4 + 1). similarly (add compose mul compose sub)(2)
   * will print 3 (step1 : 2 – 1 = 1, step2 : 1 * 2 = 2, step3 : 2 + 1 = 3).
   */
  def printResultExample1(): Unit = {
    println("Result add and mul #1 = " + (add compose mul)(2))

    // adding more methods
    println("Result add and mul and sub #1 = " + (add compose mul compose sub)(2))
  }
  //End example 1

  // Start example 2

  /**
   * andThen : andThen method also works with val functions. Syntax :
   * (function1 andThen function2)(parameter)
   * In the above syntax function1 works first with the parameter passed & then passes
   * then returns a value to be passed to function2. or as same as below:
   * function2(function1(parameter))
   */
  def printResultExample2(): Unit = {
    /**
     * In this example, firstly add function called we got 3(2 + 1) than mul function
     * called and we got 6(3 * 2). similarly add (andThen mul andThen sub)(2))
     * will print 5 (step1 : 2 + 1 = 3, step2 : 3 * 2 = 6, step3 : 6 – 1 = 5).
     */
    println("Result add and mul #2 = " + (add andThen mul)(2))

    // Adding more methods
    println("Result add and mul and sub #2 = " + (add andThen mul andThen sub)(2))
  }
  // End example 2

  // Start example 3

  /**
   * Passing methods to methods : Methods are passed to other methods. Syntax :
   * function1(function2(parameter))
   * It works as same as compose function, but it works with def and val methods.
   */
  def printResultExample3(): Unit = {
    /**
     * In this example, firstly mul function called we got 4(2 * 2) than add function called
     * and we got 5(4 + 1). similarly add(mul(sub(2)) will print 3 (step1 : 2 – 1 = 1,
     * step2 : 1 * 2 = 2, step3 : 2 + 1 = 3).
     */
    println("Result add and mul #3 = " + add(mul(2)))

    // Adding more methods
    println("Result add and mul and sub #3 = " + add(mul(sub(2))))
  }
  // End example 3

}
