/*
  Currying in Scala is simply a technique or a process of transforming a function.
  This function takes multiple arguments into a function that takes single argument.
  It is applied widely in multiple functional languages.
 */
class CurryingFuncDemo {

  /*
    Define currying function
    Syntax: def function name(argument1, argument2) = operation
   */
  def add1(x: Int, y: Int) = x + y

  /*
    Another way to declare currying function
    Syntax: def function name(argument1) = (argument2) => operation

    takes two parenthesis(add2()()), where the first parenthesis is of the function add2
    and second parenthesis is of the second function.
   */
  def add2(a: Int) = (b: Int) => a + b;

  /*
    Currying Function Using Partial Application
   */
  def add3(a: Int) = (b: Int) => a + b;

  /*
    another way(syntax) to write the currying function.
    Syntax: def function name(argument1) (argument2) = operation
   */
  def add4(a: Int)(b: Int) = a + b;

}
