/**
 * A function definition inside an another function is known as Nested Function.
 * In Scala, we can define functions inside a function and functions defined inside
 * other functions are called nested or local functions.
 *
 * Syntax:
 * def FunctionName1( parameter1, parameter2, ..) = {
 * def FunctionName2() = {
 * // code
 * }
 * }
 */
class NestedFuncDemo {

  // Start Single Nested Function

  // Function
  def maxAndMin(a: Int, b: Int): Unit = {

    // Nested Function
    def maxValue(): Unit = {
      if (a > b) {
        println("Max is: " + a)
      }
      else {
        println("Max is: " + b)
      }
    }

    // Nested Function
    def minValue(): Unit = {
      if (a < b) {
        println("Min is: " + a)
      }
      else {
        println("Min is: " + b)
      }
    }

    maxValue();
    minValue();
  }
  // End Single Nested Function

  // Start Multiple Nested Function
  // Function
  def funTestMultiNested(): Unit = {

    darvin();

    // First Nested Function
    def darvin(): Unit = {
      println("Darvin");

      rakda();

      // Second Nested Function
      def rakda(): Unit = {
        println("Rakda");

        darvinRak();

        // Third Nested Function
        def darvinRak(): Unit = {
          println("DarvinRakptpmalala");
        }
      }
    }
  }
  // End Multiple Nested Function

}