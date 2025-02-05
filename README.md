## Scala | Functions

Scala is assumed as functional programming language so these play an important role. It makes easier to debug and modify
the code. Scala functions are **first class values**.
**Difference between Scala Functions & Methods**: Function is a object which can be stored in a variable. But a method
always belongs to a class which has a name, signature bytecode etc. Basically, you can say a method is a function which
is a member of some object.

#### Function Declaration & Definition

In general, function declaration & definition have 6 components:

- **def keyword**: “def” keyword is used to declare a function in Scala.
- **function_name**: It should be valid name in lower camel case. Function name in Scala can have characters
  like +, ~, &, –, ++, \, / etc.
- **parameter_list**: In Scala, comma-separated list of the input parameters are defined, preceded with their data type,
  within the enclosed parenthesis.
- **return_type**: User must mention return type of parameters while defining function and return type of a function is
  optional. If you don’t specify any return type of a function, default return type is Unit which is equivalent to void
  in Java.
- **:** In Scala, a user can create function with or without = (equal) operator. If the user uses it, the function will
  return the desired value. If he doesn’t use it, the function will not return any value and will work like a
  subroutine.
- **Method body**: Method body is enclosed between braces { }. The code you need to be executed to perform your intended
  operations.

Syntax:

```
def function_name ([parameter_list]) : [return_type] = {
  // function body
}
```

#### Function Calling

```
function_name(paramter_list)

OR

[instance].function_name(paramter_list)
```

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4
