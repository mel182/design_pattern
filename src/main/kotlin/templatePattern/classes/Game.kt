package templatePattern.classes

abstract class Game {

    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    fun play() {

        //initialize the game
        initialize()

        //start game
        startPlay()

        //end game
        endPlay()
    }


}