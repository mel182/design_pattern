package templatePattern.classes

class Football : Game() {
    override fun initialize() {
        println("Football game initialized! Start playing")
    }

    override fun startPlay() {
        println("Football started. Enjoy your game!")
    }

    override fun endPlay() {
        println("Football game finished!")
    }
}