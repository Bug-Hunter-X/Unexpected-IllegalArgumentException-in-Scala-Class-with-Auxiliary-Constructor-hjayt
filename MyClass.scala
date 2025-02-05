```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Int = {
    if (x > 5) {
      return x * 2
    } else {
      throw new IllegalArgumentException("x must be greater than 5")
    }
  }
}

object Main extends App {
  val obj1 = new MyClass(10)
  println(obj1.myMethod()) // Output: 20

  val obj2 = new MyClass()
  println(obj2.myMethod()) // Throws IllegalArgumentException because x defaults to 0
}
```