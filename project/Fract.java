public class Fract(n :Int, d :Int){
        override def toString: String = n + "/"+d

        def result = n/d.toDouble

}

        object Fract {
        def main(args: Array[String])={
        val f = new Fract(2,4)
        print(f)
        }

        }