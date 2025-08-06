open class Tiger(val origin: String, val color: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
    fun sayColor() {
        println("The tiger color is $color")
    }
    fun greetings() {
        println("Hello, I am a tiger from $origin and I am $color")
    }
}

class SiberianTiger : Tiger("Siberia", "yellow")                  // 1

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.greetings()
    tiger.sayHello()
    tiger.sayColor()
}