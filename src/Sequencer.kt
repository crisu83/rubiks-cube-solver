object Sequencer {
    fun play(cube: Cube, sequence: Array<Move>) {
        val rotator = RotatorFactory.create(cube)
        for (color in sequence) {
            when (color) {
                Move.WHITE_CLOCKWISE -> rotator.rotate(Color.WHITE, Direction.CLOCKWISE)
                Move.RED_CLOCKWISE -> rotator.rotate(Color.RED, Direction.CLOCKWISE)
                Move.BLUE_CLOCKWISE -> rotator.rotate(Color.BLUE, Direction.CLOCKWISE)
                Move.ORANGE_CLOCKWISE -> rotator.rotate(Color.ORANGE, Direction.CLOCKWISE)
                Move.GREEN_CLOCKWISE -> rotator.rotate(Color.GREEN, Direction.CLOCKWISE)
                Move.YELLOW_CLOCKWISE -> rotator.rotate(Color.YELLOW, Direction.CLOCKWISE)
                Move.WHITE_COUNTER_CLOCKWISE -> rotator.rotate(Color.WHITE, Direction.COUNTER_CLOCKWISE)
                Move.RED_COUNTER_CLOCKWISE -> rotator.rotate(Color.RED, Direction.COUNTER_CLOCKWISE)
                Move.BLUE_COUNTER_CLOCKWISE -> rotator.rotate(Color.BLUE, Direction.COUNTER_CLOCKWISE)
                Move.ORANGE_COUNTER_CLOCKWISE -> rotator.rotate(Color.ORANGE, Direction.COUNTER_CLOCKWISE)
                Move.GREEN_COUNTER_CLOCKWISE -> rotator.rotate(Color.GREEN, Direction.COUNTER_CLOCKWISE)
                Move.YELLOW_COUNTER_CLOCKWISE -> rotator.rotate(Color.YELLOW, Direction.COUNTER_CLOCKWISE)
            }
        }
    }
}