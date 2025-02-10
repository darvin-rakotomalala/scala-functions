package overriding

// Creating a subclass
class Circle extends Shapes {
  // Overriding method to find
  // area of the circle
  override def Area(l: Double, b: Double, r: Double): Double = {
    ((3.14) * r * r)
  }
}
