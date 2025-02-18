import access_modifier.{ControllingMethodScopeDemo, PackageSpecificDemo, PrivateProtectedScopeDemo, PrivateScopeDemo, PublicScopeDemo}
import overriding.MethodOverridingDemo
import superclass.{ScalaDemo, Student}

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

  println("----------------------------------------------")
  println("- Closures Functions example")
  val closureFunc = new ClosuresFuncDemo
  closureFunc.closureFuncExample1()
  closureFunc.closureFuncExample2()

  println("----------------------------------------------")
  println("- Single Nested Function example")
  val nestedFunc = new NestedFuncDemo
  println("Min and Max from 5, 7")
  nestedFunc.maxAndMin(5, 7);

  println("- Multiple Nested Function example")
  nestedFunc.funTestMultiNested()

  println("----------------------------------------------")
  println("- Parameterless Method example")
  val parameterless = new ParameterlessMethod("Darvin", 50)
  parameterless.author
  parameterless.article
  parameterless.printInformation()

  println("----------------------------------------------")
  println("- Partially applied functions example")
  val appliedFunc = new PartiallyAppliedFuncDemo
  appliedFunc.AppliedFuncExample1()
  appliedFunc.AppliedFuncExample2()
  appliedFunc.AppliedFuncExample3()
  appliedFunc.AppliedFuncExample4()

  println("----------------------------------------------")
  println("- Method Overloading example")
  val mOverloading = new MethodOverloadingDemo
  mOverloading.funcExample1(6, 8)
  mOverloading.funcExample1(5, 10, 58)

  mOverloading.funcExample2(6, 8, 10)
  mOverloading.funcExample2(5.9, 10.01, 58.7)

  mOverloading.funcExample3("Rolex", 10)
  mOverloading.funcExample3("Omega", 10)

  println("----------------------------------------------")
  println("- Method Overriding example")
  val mOverriding = new MethodOverridingDemo
  mOverriding.printResultMethodOverriding1()
  mOverriding.printResultMethodOverriding2()
  mOverriding.printResultMethodOverriding3()

  println("----------------------------------------------")
  println("- Format and Formated Method example")
  val formatMethod = new FormatMethodDemo
  formatMethod.formatMethodExample1()
  formatMethod.formatMethodExample2()
  formatMethod.formattedMethodExample3()

  println("----------------------------------------------")
  println("- Controlling Method Scope example")

  println("- Public Scope example")
  val publicScope = new PublicScopeDemo
  publicScope.publicMethod1()

  println("- Private Scope example")
  val privateScope = new PrivateScopeDemo
  printf("x = " + privateScope.x)
  // privateScope.privateMethod1() // Will throw an error
  println()

  println("- Protected Scope example")
  val accessModifier = new ControllingMethodScopeDemo
  accessModifier.printProtectedScope()

  println("- Private/Protected Scope example")
  var privateProtected = new PrivateProtectedScopeDemo()
  var y = 2
  println(privateProtected.printPrivateProtected(privateProtected))
  println(privateProtected.z)
  // println(privateProtected.t) // error: t cannot be accessed
  // println(privateProtected.x) // error: x can only be accessed from class PrivateProtectedScopeDemo

  println("- Package Specific example")
  val packageSpecific = new PackageSpecificDemo
  val subClass = new packageSpecific.g1
  subClass.methodExample()
  // println("b= " + subClass.b) // variable b can only be accessed from package access_modifier

  println("----------------------------------------------")
  println("- Repeated Method Parameters example")
  val repeatParam = new RepeatedMethodParametersDemo
  repeatParam.addExample()
  repeatParam.mulExample()
  repeatParam.showStrExample()

  println("----------------------------------------------")
  println("- Partial Functions example")
  val partialFunc = new PartialFuncDemo
  partialFunc.printResultExample1()
  partialFunc.printResultCaseStatement()
  partialFunc.printResultOrElse()
  partialFunc.printResultCollect()
  partialFunc.printResultAndThen()

  println("----------------------------------------------")
  println("- Lambda Expression example")
  val lambdaExp = new LambdaExpressionDemo
  lambdaExp.lambdaExpExample1()
  lambdaExp.transCollectionExample2()
  lambdaExp.transCollectionExample3()
  lambdaExp.printResultTransform1()
  lambdaExp.printResultTransform2()

  println("----------------------------------------------")
  println("- Varargs example")
  val varargs = new VarargsDemo
  varargs.printResultVarargs1()
  varargs.printResultVarargs2()

  println("----------------------------------------------")
  println("- Function Composition example")
  val funcComp = new FuncCompositionDemo
  funcComp.printResultExample1()
  funcComp.printResultExample2()
  funcComp.printResultExample3()

  println("----------------------------------------------")

  /**
   * This concept is used when we want to call super class method. So whenever a base
   * and subclass have same named methods then to resolve ambiguity we use super keyword
   * to call base class method. The keyword “super” came into this with the concept of Inheritance.
   */

  println("- Call a method on a Super Class example")
  val callSC1 = new ScalaDemo
  callSC1.readThanWrite()

  val callSC2 = new Student
  callSC2.display()

  
  