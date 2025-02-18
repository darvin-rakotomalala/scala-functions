package superclass

class Student extends Person {

  override def message(): Unit = {
    println("This is student class")
  }

  /**
   * In this example, we have seen that if we only call method message() then,
   * the current class message() is invoked but with the use of super keyword,
   * message() of super class could also be invoked.
   */
  // Note that display() is only in Student class
  def display(): Unit = {
    // will invoke or call current class message() method
    message()

    // will invoke or call parent class message() method
    super.message()
  }

}
