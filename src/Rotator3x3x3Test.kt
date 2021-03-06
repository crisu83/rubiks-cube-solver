class Rotator3x3x3Test : CubeTestCase() {
    fun testRotateWhiteFaceClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.WHITE, Direction.CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWWWWWWWW
            R: BBBRRRRRR
            B: OOOBBBBBB
            O: GGGOOOOOO
            G: RRRGGGGGG
            Y: YYYYYYYYY
            """
        )
    }

    fun testRotateRedFaceClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.RED, Direction.CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWWWWWGGG
            R: RRRRRRRRR
            B: WBBWBBWBB
            O: OOOOOOOOO
            G: GGYGGYGGY
            Y: BBBYYYYYY
            """
        )
    }

    fun testRotateBlueFaceClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.BLUE, Direction.CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWRWWRWWR
            R: RRYRRYRRY
            B: BBBBBBBBB
            O: WOOWOOWOO
            G: GGGGGGGGG
            Y: YYOYYOYYO
            """
        )
    }

    fun testRotateOrangeFaceClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.ORANGE, Direction.CLOCKWISE)
        assertCube(
            cube,
            """
            W: BBBWWWWWW
            R: RRRRRRRRR
            B: BBYBBYBBY
            O: OOOOOOOOO
            G: WGGWGGWGG
            Y: YYYYYYGGG
            """
        )
    }

    fun testRotateGreenFaceClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.GREEN, Direction.CLOCKWISE)
        assertCube(
            cube,
            """
            W: OWWOWWOWW
            R: WRRWRRWRR
            B: BBBBBBBBB
            O: OOYOOYOOY
            G: GGGGGGGGG
            Y: RYYRYYRYY
            """
        )
    }

    fun testRotateYellowFaceClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.YELLOW, Direction.CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWWWWWWWW
            R: RRRRRRGGG
            B: BBBBBBRRR
            O: OOOOOOBBB
            G: GGGGGGOOO
            Y: YYYYYYYYY
            """
        )
    }

    fun testRotateWhiteFaceCounterClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.WHITE, Direction.COUNTER_CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWWWWWWWW
            R: GGGRRRRRR
            B: RRRBBBBBB
            O: BBBOOOOOO
            G: OOOGGGGGG
            Y: YYYYYYYYY
            """
        )
    }

    fun testRotateRedFaceCounterClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.RED, Direction.COUNTER_CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWWWWWBBB
            R: RRRRRRRRR
            B: YBBYBBYBB
            O: OOOOOOOOO
            G: GGWGGWGGW
            Y: GGGYYYYYY
            """
        )
    }

    fun testRotateBlueFaceCounterClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.BLUE, Direction.COUNTER_CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWOWWOWWO
            R: RRWRRWRRW
            B: BBBBBBBBB
            O: YOOYOOYOO
            G: GGGGGGGGG
            Y: YYRYYRYYR
            """
        )
    }

    fun testRotateOrangeFaceCounterClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.ORANGE, Direction.COUNTER_CLOCKWISE)
        assertCube(
            cube,
            """
            W: GGGWWWWWW
            R: RRRRRRRRR
            B: BBWBBWBBW
            O: OOOOOOOOO
            G: YGGYGGYGG
            Y: YYYYYYBBB
            """
        )
    }

    fun testRotateGreenFaceCounterClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.GREEN, Direction.COUNTER_CLOCKWISE)
        assertCube(
            cube,
            """
            W: RWWRWWRWW
            R: YRRYRRYRR
            B: BBBBBBBBB
            O: OOWOOWOOW
            G: GGGGGGGGG
            Y: OYYOYYOYY
            """
        )
    }

    fun testRotateYellowFaceCounterClockwise() {
        val cube = Cube()
        val rotator = createRotator(cube)
        rotator.rotate(Color.YELLOW, Direction.COUNTER_CLOCKWISE)
        assertCube(
            cube,
            """
            W: WWWWWWWWW
            R: RRRRRRBBB
            B: BBBBBBOOO
            O: OOOOOOGGG
            G: GGGGGGRRR
            Y: YYYYYYYYY
            """
        )
    }

    private fun createRotator(cube: Cube): RotatorInterface {
        return RotatorFactory.create(cube)
    }
}