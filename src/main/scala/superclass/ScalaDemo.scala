package superclass

/* Subclass ScalaDemo */
class ScalaDemo extends ComputerScience {

  /**
   * In above example, we are calling multiple method of super class by using super keyword.
   */
  // Note that readThanWrite() is only in ScalaDemo class
  def readThanWrite(): Unit = {
    // Will invoke or call parent class read() method
    super.read()

    // Will invoke or call parent class write() method
    super.write()
  }

}
