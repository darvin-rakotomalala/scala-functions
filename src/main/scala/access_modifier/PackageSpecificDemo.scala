package access_modifier

class PackageSpecificDemo {
  class g1 {
    // inner class
    // private to class g1
    private var a = 0

    // available to package access_modifier
    private[access_modifier] var b = 0

    def methodExample(): Unit = {
      a = a + 1
      b = b + 1
      println("welcome to inner class g1")
      println("a= " + a)
    }
  }

}
