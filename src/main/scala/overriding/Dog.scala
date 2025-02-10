package overriding

// Extending the class Animal
class Dog extends Animal {

  // using override keyword
  override def number(): Unit = {
    // Displays output
    println("We have two dogs")
  }

}
