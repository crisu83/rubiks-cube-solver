import kotlin.random.Random

object Scrambler {
    /**
     * Scrambles the given cube.
     */
    fun scramble(cube: Cube, numberOfMoves: Int = 20, seed: Int? = null) {
        val sequence = randomSequence(numberOfMoves, seed)
        println("Scramble" + (if (seed is Int) "($seed)" else "") + ": " + sequence.joinToString(" "))
        Sequencer.play(cube, sequence)
    }

    private fun randomSequence(length: Int, seed: Int?): Array<Move> {
        val random = if (seed is Int) Random(seed) else Random
        val moves = Array(length) { it }.map { _ -> randomMove(random) }
        return moves.toTypedArray()
    }

    private fun randomMove(random: Random): Move {
        val values = Move.values()
        return values[random.nextInt(0, values.size)]
    }
}