object Scrambler {
    /**
     * Scrambles the given cube.
     */
    fun scramble(cube: Cube, numMoves: Int = 20) {
        val sequence = randomSequence(numMoves)
        println("Scramble: " + sequence.joinToString(", "))
        Sequencer.play(cube, sequence)
    }

    private fun randomSequence(length: Int): Array<Move> {
        val moves = Array(length) { it }.map { _ -> randomMove() }
        return moves.toTypedArray()
    }

    private fun randomMove(): Move {
        return Move.values().random()
    }
}