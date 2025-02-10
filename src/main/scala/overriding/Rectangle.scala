package overriding

// Creating a subclass
class Rectangle extends Shapes {
  // Overriding method to find
  // area of the rectangle
  override def Area(l: Double, b: Double, r: Double): Double = {
    (l * b)
  }
}
