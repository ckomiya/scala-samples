import scala.actors._
import scala.actors.Actor._
case object Comida
case object Bebida
class Persona() extends Actor {
  def act() {
    loop {
      react {
        case Comida => {
           println("Mmmmm..." )
           println("yummy yummy..." )
        }
        case Bebida => {
           println("glup glup..." )
           println("Ahhhhh..." )
        }
      }
    }
  }
}
val david = new Persona().start
val carol = new Persona().start
println("Listo para empezar a comer y beber..." )
david ! Comida
carol ! Comida
david ! Bebida
carol ! Bebida

