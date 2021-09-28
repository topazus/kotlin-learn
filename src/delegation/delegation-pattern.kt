interface SoundBehavior {
    fun makeSound()
}

class DogSound(val n: String): SoundBehavior {
    override fun makeSound() {
        println("dog $n is barking")
    }
}

class CatSound(val n: String): SoundBehavior {
    override fun makeSound() {
        println("cat $n is mewing")
    }
}

class DogJerrySound(n: String): SoundBehavior by DogSound(n)
class CatTomSound(n: String): SoundBehavior by CatSound(n)


fun main() {
    val dogJerrySound = DogJerrySound("jerry")
    dogJerrySound.makeSound()
    val catTomSound = CatTomSound("tom")
    catTomSound.makeSound()
}