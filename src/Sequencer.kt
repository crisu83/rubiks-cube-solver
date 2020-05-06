object Sequencer {
    fun play(cube: Cube, sequence: Array<Move>) {
        for (color in sequence) {
            when (color) {
                Move.WHITE_CLOCKWISE -> Rotator.rotate(cube, Color.WHITE, Direction.CLOCKWISE)
                Move.RED_CLOCKWISE -> Rotator.rotate(cube, Color.RED, Direction.CLOCKWISE)
                Move.BLUE_CLOCKWISE -> Rotator.rotate(cube, Color.BLUE, Direction.CLOCKWISE)
                Move.ORANGE_CLOCKWISE -> Rotator.rotate(cube, Color.ORANGE, Direction.CLOCKWISE)
                Move.GREEN_CLOCKWISE -> Rotator.rotate(cube, Color.GREEN, Direction.CLOCKWISE)
                Move.YELLOW_CLOCKWISE -> Rotator.rotate(cube, Color.YELLOW, Direction.CLOCKWISE)
                Move.WHITE_COUNTER_CLOCKWISE -> Rotator.rotate(cube, Color.WHITE, Direction.COUNTER_CLOCKWISE)
                Move.RED_COUNTER_CLOCKWISE -> Rotator.rotate(cube, Color.RED, Direction.COUNTER_CLOCKWISE)
                Move.BLUE_COUNTER_CLOCKWISE -> Rotator.rotate(cube, Color.BLUE, Direction.COUNTER_CLOCKWISE)
                Move.ORANGE_COUNTER_CLOCKWISE -> Rotator.rotate(cube, Color.ORANGE, Direction.COUNTER_CLOCKWISE)
                Move.GREEN_COUNTER_CLOCKWISE -> Rotator.rotate(cube, Color.GREEN, Direction.COUNTER_CLOCKWISE)
                Move.YELLOW_COUNTER_CLOCKWISE -> Rotator.rotate(cube, Color.YELLOW, Direction.COUNTER_CLOCKWISE)
            }
        }
    }
}