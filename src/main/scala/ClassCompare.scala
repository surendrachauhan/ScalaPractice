import scala.language.implicitConversions

class ClassOne[T] (val input : T){}

class ClassOneStr(val one: ClassOne[String] ){
  def duplicateString() = one.input + one.input
}

class ClassOneInt(val one: ClassOne[Int]){
  def duplicateInt()= one.input.toString + one.input.toString
}

implicit def toStrMethod(one : ClassOne[String]) = new ClassOneStr(one)
implicit def toIntMethod(one : ClassOne[Int]) = new ClassOneInt(one)
