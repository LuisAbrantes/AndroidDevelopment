
open class Cat {
    open fun meow() {
        println("Meow meow!")
    }
}

class Seamese: Cat() {
    override fun meow() {
        println("Seamese meow!")
    }
}

class Persian: Cat() {
    override fun meow() {
        println("Persian meow!")
    }
}


fun main() {
    val traditionalCat: Cat = Cat()
    val littleCat: Cat = Seamese()
    val bigCat: Cat = Persian()
    traditionalCat.meow()
    littleCat.meow()
    bigCat.meow()
}