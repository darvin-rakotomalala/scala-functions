/**
 * When a String contains values as well as texts succeeding it then formatting
 * is required for changing values and adding texts enclosing it.
 */
class FormatMethodDemo {

  def formatMethodExample1(): Unit = {
    // Creating format string
    val x = "There are %d books and" +
      "cost of each book is %f"

    // Assigning values
    val y = 15
    val z = 345.25

    // Applying format method
    val r = x.format(y, z)

    // Displays format string
    println(r)
  }

  def formatMethodExample2(): Unit = {
    // Creating format string
    // Here, %s is used for strings and %c is used for characters.
    val x = "Darvi%c is a %s."

    // Assigning values
    val a = 'n'
    val b = "coder"

    // Applying format method
    val r = x.format(a, b)

    // Displays format string
    println(r)
  }

  def formattedMethodExample3(): Unit = {
    // Assigning values
    val x = 30

    // Applying formatted method
    val r = x.formatted("I have written %d articles.")

    // Displays format string
    println(r)
  }

}
