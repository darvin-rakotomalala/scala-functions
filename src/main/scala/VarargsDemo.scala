/**
 * It allows us to indicate that last argument of a function is a variable length argument,
 * so it may be repeated multiple times. we can pass as many argument as we want.
 * This allows programmers to pass variable length argument lists to the function.
 * Inside function, the type of args inside the declared are actually saved as a Array[Datatype]
 * for example can be declared as type String* is actually Array[String].
 * Note :- We place * on the last argument to make it variable length.
 * Syntax : –
 * def Nameoffunction(args: Int *) : Int = { s foreach println. }
 *
 * Below are some restrictions of varargs :
 * The last parameter in the list must be the repeating argument.
 * def sum(a :Int, b :Int, args: Int *)
 * No default values for any parameters in the method containing the varargs.
 * All values must be same data type otherwise error.
 * > sum(5, 3, 1000, 2000, 3000, "one")
 * > error: type mismatch;
 * found : String("one")
 * required: Int
 * Inside the body args is an array, so all values are packed into an array
 */
class VarargsDemo {

  // Start example 1

  /**
   * In this example we can see the last argument of the function is a variable length argument.
   * here 1000 is variable length argument. argument arg is added to the result variable.
   * the names argument is of type Integer.
   */
  // declaration and definition of function
  def sum(a: Int, b: Int, args: Int*): Int = {
    var result = a + b

    for (arg <- args) {
      result += arg
    }
    return result
  }

  def printResultVarargs1(): Unit = {
    // Calling the function
    println("Sum varargs 1 is: " + sum(5, 3, 1000, 2000, 3000));
  }
  // End example 1

  // Start example 2

  /**
   * In this example as we have defined it using the * syntax so it is a variable argument.
   * the names argument is of type String.
   */
  // declaration and definition of function
  def printStr(strings: String*): Unit = {
    strings.foreach(println)
  }

  def printResultVarargs2(): Unit = {
    // calling of function
    printStr("Geeks", "for", "geeks")
  }
  // End example 2

}
