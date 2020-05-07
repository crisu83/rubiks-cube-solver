class SequencerTest : CubeTestCase() {
    fun testPlay() {
        val cube = createCube()
        val sequence = arrayOf(
            Move.RED_CLOCKWISE,
            Move.GREEN_CLOCKWISE,
            Move.WHITE_COUNTER_CLOCKWISE,
            Move.YELLOW_CLOCKWISE,
            Move.BLUE_CLOCKWISE
        )
        Sequencer.play(cube, sequence)
        assertCube(
            cube,
            """
            W: WWGWWROOY
            R: GGRWRBYYB
            B: GWWRBRRBR
            O: GBBGOYOBB
            G: OOBGGGOOY
            Y: RRWYYOYYW
            """
        )
    }
}