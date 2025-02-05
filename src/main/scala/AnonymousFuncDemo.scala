/*
  An anonymous function is also known as a function literal.
  A function which does not contain a name is known as an anonymous function.
  It is useful when we want to create an inline function.

  Syntax:
    (z:Int, y:Int) => z*y
    Or
    (_:Int)*(_:Int)
 */
class AnonymousFuncDemo {

  // Anonymous Functions With Parameters
  var myfunc1 = (str1: String, str2: String) => str1 + str2

  var myfunc2 = (_: String) + (_: String)

  // Start Anonymous Functions Without Parameters

  // A function which contain anonymous
  // function as a parameter
  def myfunction(fun: (String, String) => String) = {
    fun("Dog", "Cat")
  }

  def anonymousFuncWithoutParam(): Unit = {

    var myfunc3 = () => {
      "Welcome to DarvinDev...!!"
    }
    println(myfunc3())

    // Explicit type declaration of anonymous
    // function in another function
    val f1 = myfunction((str1: String,
                         str2: String) => str1 + str2)

    // Shorthand declaration using wildcard
    val f2 = myfunction(_ + _)
    println(f1)
    println(f2)
  }
  // End Anonymous Functions Without Parameters

}
