
/**
 * A parameterless method is a function that does not take parameters,
 * defined by the absence of any empty parenthesis.
 */
class ParameterlessMethod(name: String, ar: Int) {
  // A parameterless method
  def author = println(name)

  def article = println(ar)

  // An empty-parenthesis method
  def printInformation() = {
    println("User -> " + name + ", Articles -> " + ar)
  }
}
