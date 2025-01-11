```scala
class MyClass(val x: Int) {
  def this() = this(0) //this is the bug line
}
```