package overriding

/**
 * In Scala, the overriding features are further elaborated as here, both methods as well as
 * var or val can be overridden. If a subclass has the method name identical to the method
 * name defined in the parent class then it is known to be Method Overriding i.e,
 * the sub-classes which are inherited by the declared super class, overrides the method
 * defined in the super class utilizing the override keyword.
 */
class MethodOverridingDemo {

  def printResultMethodOverriding1(): Unit = {
    // Creating instances of all
    // the sub-classes
    var x = new class_1()
    var y = new class_2()
    var z = new class_3()

    // Displays number of students in class_1
    println("Number of students in class 1 : " +
      x.NumberOfStudents())

    // Displays number of students in class_2
    println("Number of students in class 2 : " +
      y.NumberOfStudents())

    // Displays number of students in class_3
    println("Number of students in class 3 : " +
      z.NumberOfStudents())
  }

  def printResultMethodOverriding2(): Unit = {
    // Creating instances of all
    // the sub-classes
    var rectangle = new Rectangle()
    var circle = new Circle()

    // Displays area of the rectangle
    println("Result area Rectangle : " + rectangle.Area(3, 11, 4))

    // Displays area of the circle
    println("Result area Circle : " + circle.Area(1, 7, 10))
  }

  def printResultMethodOverriding3(): Unit = {
    // Creating object of the subclass Dog
    var x = new Dog()
    // Calling overridden method
    x.number()
  }

}
