package templatePattern

import templatePattern.classes.BaseBall
import templatePattern.classes.Football
import templatePattern.classes.Game

fun main() {
    println("Main function called!")

    var game:Game = BaseBall()
    game.play()
    println()
    game = Football()
    game.play()

}