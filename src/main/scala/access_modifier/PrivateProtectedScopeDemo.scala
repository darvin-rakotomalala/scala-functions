package access_modifier

/**
 * To mark an member object private use the keywords private[this].
 * To mark an member object protected use the keywords protected[this],
 * where this refers or points to the current object.
 */
class PrivateProtectedScopeDemo {
  private[this] var x = 1
  private var t = 2
  var z = 3

  def printPrivateProtected(other: PrivateProtectedScopeDemo): Unit = {
    println(x)
    println(t)
    println(z)

    // println(other.x)
    println(other.t)
    println(other.z)
  }
}
