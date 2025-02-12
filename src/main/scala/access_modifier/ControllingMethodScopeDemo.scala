package access_modifier

/**
 * As the name suggests Access Modifiers in scala helps to restrict the scope of a class,
 * variable, method or data member. Controlling Method Scope In Scala helps to restrict
 * the scope of method or data member. There are five types of controlling method scope in Scala:
 * Public Scope
 * Private Scope
 * Protected Scope
 * Object-private Scope
 * Package Specific
 */
class ControllingMethodScopeDemo extends ProtectedScopeDemo {

  def printProtectedScope(): Unit = {
    println("Protected Scope - var ab = " + ab) //can be accessed
    println("Protected Scope - var ad = " + ad) //can be accessed
  }
}
