//override

fun main() {
   var t = Tiger()
   t.eat()
   
}

open class Animal {
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger: Animal(){
    override fun eat() {
        println("고기를 먹습니다")
    }
}

//abstract
fun main() {
   var r = Rabbit()
   
   r.eat()
   r.sniff()
   
}

abstract class Animal(){
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal(){
    override fun eat(){
        println("당근을 먹습니다")
    }
}

//interface
fun main() {
  
    var d = Dog()
    
    d.run()
    d.eat()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog: Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }
    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}