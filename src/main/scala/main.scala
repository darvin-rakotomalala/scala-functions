@main
def main(): Unit =
  println("----------------------------------------------")
  println("Hello world! This is Scala program of function")

  val funcExample = new FunctionDemo
  println("- Calling the function example")
  println("Sum is: " + funcExample.functionToAdd(5, 3));

  println("----------------------------------------------")

  println("- Currying Functions example")
  val curryFunc = new CurryingFuncDemo
  println("Sum is add1: " + curryFunc.add1(20, 19));
  println("Sum is add2: " + curryFunc.add2(20)(19));

  println("- Partially Applied function example")
  val sum = curryFunc.add3(29);
  println("Sum is add3: " + sum(5));
  println("Sum is add4 #1: " + curryFunc.add4(29)(5));

  // Partially Applied function.
  val sum4 = curryFunc.add4(29) _; // Here, only the ‘_’ is added after the calling the function add4 for value of sum.
  println("Sum is add4 #2: " + sum4(5));

  println("----------------------------------------------")

  println("- Anonymous Functions With Parameters example")
  val anonymousFunc = new AnonymousFuncDemo
  println(anonymousFunc.myfunc1("Darvin", "Tojo"))
  println(anonymousFunc.myfunc2("Darvin", "Rakotomalala"))

  println("- Anonymous Functions Without Parameters example")
  anonymousFunc.anonymousFuncWithoutParam()

  println("----------------------------------------------")
  println("- Higher Order Functions example")
  val hOrderFunc = new HigherOrderFuncDemo
  hOrderFunc.higherOrderFuncExample()




