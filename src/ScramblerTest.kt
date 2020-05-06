class ScramblerTest : CubeTestCase() {
    fun testScramble() {
        val cube = createCube()
        Scrambler.scramble(cube, 20, 123)
        assertCube(
            cube,
            """
            W: WRGYWOYOB
            R: RWRRRGYGO
            B: GBBOBBRWW
            O: YGRYOWYYO
            G: GGBRGBBRW
            Y: OWGYYBOOW
            """
        )
    }
}