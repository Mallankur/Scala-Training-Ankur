import scala.io.StdIn._
object AnkurBhai extends App {
  /*
  def addI(x: Int,y: Int):Int=x+y
  def addS(x: String,y: String) : String= x+y

  println(addI(1,2))
  println(addS("1","2"))
*/
  println(Array33++










    (List('a'),'b',123))
  var str =" "
  while (str != "") {
    str = readLine().filter(_ != ' ')
    //println(str)
    if (str != "") {
      val x = str.split(",").map(_.toInt)

      def student(K: Int, L: Int, M: Int) = {
        if (M >= L * K) {
          println("Yes")
        }
        else {
          println("No")
        }

      }

      student(x(0), x(1), x(2));
    }
  }
}