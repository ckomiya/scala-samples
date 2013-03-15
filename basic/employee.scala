class Person(val name: String) {
  def talk(message: String) = println(name + " says " + message)
  def id(): String = name
}

class Employee(override val name: String, 
                        val number: Int) extends Person(name) {
  override def talk(message: String) {
    println(name + " con nro " + number + " dice " + message)
  }
  override def id():String = number.toString
} 

val employee = new Employee("Bob", 4)
employee.talk("Hooola")
