package access_modifier

/**
 * Protected members cannot be accessed by other members in other packages even with imports.
 */
class ProtectedScopeDemo {
  protected var ab: Int = 4
  var ad: Int = 1
}
