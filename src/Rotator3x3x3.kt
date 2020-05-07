/**
 * Rotator service that allows to rotate the given cube.
 */
class Rotator3x3x3(private val cube: Cube) : RotatorInterface {
    /**
     * A list of moves performed by this rotator.
     */
    private val moves = mutableListOf<Move>()

    /**
     * Rotates the face of the given cube in the given direction.
     *
     * For example rotating a face clockwise:
     *
     *   0 1 2     6 3 0     8 7 6     2 5 8
     *   3 4 5  >  7 4 1  >  5 4 3  >  1 4 7
     *   6 7 8     8 5 2     2 1 0     0 3 6
     */
    override fun rotate(color: Color, direction: Direction) {
        when (direction) {
            Direction.CLOCKWISE ->
                when (color) {
                    Color.WHITE -> {
                        rotateFaceClockwise(cube.getFace(Color.WHITE))
                        swapTopToTop(cube.getFace(Color.RED), cube.getFace(Color.GREEN))
                        swapTopToTop(cube.getFace(Color.RED), cube.getFace(Color.ORANGE))
                        swapTopToTop(cube.getFace(Color.RED), cube.getFace(Color.BLUE))
                        moves.add(Move.WHITE_CLOCKWISE)
                    }
                    Color.RED -> {
                        rotateFaceClockwise(cube.getFace(Color.RED))
                        swapBottomToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.BLUE))
                        swapBottomToTop(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapBottomToRight(cube.getFace(Color.WHITE), cube.getFace(Color.GREEN))
                        moves.add(Move.RED_CLOCKWISE)
                    }
                    Color.BLUE -> {
                        rotateFaceClockwise(cube.getFace(Color.BLUE))
                        swapRightToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.ORANGE))
                        swapRightToRight(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapRightToRight(cube.getFace(Color.WHITE), cube.getFace(Color.RED))
                        moves.add(Move.BLUE_CLOCKWISE)
                    }
                    Color.ORANGE -> {
                        rotateFaceClockwise(cube.getFace(Color.ORANGE))
                        swapTopToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.GREEN))
                        swapTopToBottom(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapTopToRight(cube.getFace(Color.WHITE), cube.getFace(Color.BLUE))
                        moves.add(Move.ORANGE_CLOCKWISE)
                    }
                    Color.GREEN -> {
                        rotateFaceClockwise(cube.getFace(Color.GREEN))
                        swapLeftToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.RED))
                        swapLeftToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapLeftToRight(cube.getFace(Color.WHITE), cube.getFace(Color.ORANGE))
                        moves.add(Move.GREEN_CLOCKWISE)
                    }
                    Color.YELLOW -> {
                        rotateFaceClockwise(cube.getFace(Color.YELLOW))
                        swapBottomToBottom(cube.getFace(Color.RED), cube.getFace(Color.BLUE))
                        swapBottomToBottom(cube.getFace(Color.RED), cube.getFace(Color.ORANGE))
                        swapBottomToBottom(cube.getFace(Color.RED), cube.getFace(Color.GREEN))
                        moves.add(Move.YELLOW_CLOCKWISE)
                    }
                }
            Direction.COUNTER_CLOCKWISE ->
                when (color) {
                    Color.WHITE -> {
                        rotateFaceCounterClockwise(cube.getFace(Color.WHITE))
                        swapTopToTop(cube.getFace(Color.RED), cube.getFace(Color.BLUE))
                        swapTopToTop(cube.getFace(Color.RED), cube.getFace(Color.ORANGE))
                        swapTopToTop(cube.getFace(Color.RED), cube.getFace(Color.GREEN))
                        moves.add(Move.WHITE_COUNTER_CLOCKWISE)
                    }
                    Color.RED -> {
                        rotateFaceCounterClockwise(cube.getFace(Color.RED))
                        swapBottomToRight(cube.getFace(Color.WHITE), cube.getFace(Color.GREEN))
                        swapBottomToTop(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapBottomToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.BLUE))
                        moves.add(Move.RED_COUNTER_CLOCKWISE)
                    }
                    Color.BLUE -> {
                        rotateFaceCounterClockwise(cube.getFace(Color.BLUE))
                        swapRightToRight(cube.getFace(Color.WHITE), cube.getFace(Color.RED))
                        swapRightToRight(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapRightToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.ORANGE))
                        moves.add(Move.BLUE_COUNTER_CLOCKWISE)
                    }
                    Color.ORANGE -> {
                        rotateFaceCounterClockwise(cube.getFace(Color.ORANGE))
                        swapTopToRight(cube.getFace(Color.WHITE), cube.getFace(Color.BLUE))
                        swapTopToBottom(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapTopToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.GREEN))
                        moves.add(Move.ORANGE_COUNTER_CLOCKWISE)
                    }
                    Color.GREEN -> {
                        rotateFaceCounterClockwise(cube.getFace(Color.GREEN))
                        swapLeftToRight(cube.getFace(Color.WHITE), cube.getFace(Color.ORANGE))
                        swapLeftToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.YELLOW))
                        swapLeftToLeft(cube.getFace(Color.WHITE), cube.getFace(Color.RED))
                        moves.add(Move.GREEN_COUNTER_CLOCKWISE)
                    }
                    Color.YELLOW -> {
                        rotateFaceCounterClockwise(cube.getFace(Color.YELLOW))
                        swapBottomToBottom(cube.getFace(Color.RED), cube.getFace(Color.GREEN))
                        swapBottomToBottom(cube.getFace(Color.RED), cube.getFace(Color.ORANGE))
                        swapBottomToBottom(cube.getFace(Color.RED), cube.getFace(Color.BLUE))
                        moves.add(Move.YELLOW_COUNTER_CLOCKWISE)
                    }
                }
        }
    }

    override fun getMoves(): Array<Move> {
        return moves.toTypedArray()
    }

    /**
     * Rotates the given face clockwise.
     *
     *   0 1 2     6 3 0
     *   3 4 5  >  7 4 1
     *   6 7 8     8 5 2
     */
    private fun rotateFaceClockwise(face: Face) {
        swap(face, 0, face, 2)
        swap(face, 1, face, 5)
        swap(face, 0, face, 8)
        swap(face, 1, face, 3)
        swap(face, 0, face, 6)
        swap(face, 3, face, 7)
    }

    /**
     * Rotates the given face counter-clockwise.
     *
     *   0 1 2     2 5 8
     *   3 4 5  >  1 4 7
     *   6 7 8     0 3 6
     */
    private fun rotateFaceCounterClockwise(face: Face) {
        swap(face, 0, face, 6)
        swap(face, 1, face, 3)
        swap(face, 2, face, 0)
        swap(face, 1, face, 7)
        swap(face, 2, face, 8)
        swap(face, 1, face, 5)
    }

    /**
     * Swaps the top layer with the top layer between two faces.
     *
     *   R R R   B B B     B B B   R R R
     *   R R R   B B B  >  R R R   B B B
     *   R R R   B B B     R R R   B B B
     */
    private fun swapTopToTop(aFace: Face, bFace: Face) {
        for (index in 0..2) {
            swap(aFace, index, bFace, index)
        }
    }

    /**
     * Swaps the top layer with the bottom layer between two faces.
     *
     *   R R R   B B B     B B B   B B B
     *   R R R   B B B  >  R R R   B B B
     *   R R R   B B B     R R R   R R R
     */
    private fun swapTopToBottom(aFace: Face, bFace: Face) {
        swap(aFace, 0, bFace, 6)
        swap(aFace, 1, bFace, 7)
        swap(aFace, 2, bFace, 8)
    }

    /**
     * Swaps the top layer with the left layer between two faces.
     *
     *   R R R   B B B     B B B   R B B
     *   R R R   B B B  >  R R R   R B B
     *   R R R   B B B     R R R   R B B
     */
    private fun swapTopToLeft(aFace: Face, bFace: Face) {
        swap(aFace, 0, bFace, 0)
        swap(aFace, 1, bFace, 3)
        swap(aFace, 2, bFace, 6)
    }

    /**
     * Swaps the top layer with the right layer between two faces.
     *
     *   R R R   B B B     B B B   B B R
     *   R R R   B B B  >  R R R   B B R
     *   R R R   B B B     R R R   B B R
     */
    private fun swapTopToRight(aFace: Face, bFace: Face) {
        swap(aFace, 0, bFace, 2)
        swap(aFace, 1, bFace, 5)
        swap(aFace, 2, bFace, 8)
    }

    /**
     * Swaps the bottom layer with the top layer between two faces.
     *
     *   R R R   B B B     R R R   R R R
     *   R R R   B B B  >  R R R   B B B
     *   R R R   B B B     B B B   B B B
     */
    private fun swapBottomToTop(aFace: Face, bFace: Face) {
        swap(aFace, 6, bFace, 0)
        swap(aFace, 7, bFace, 1)
        swap(aFace, 8, bFace, 2)
    }

    /**
     * Swaps the bottom layer with the bottom layer between two faces.
     *
     *   R R R   B B B     R R R   B B B
     *   R R R   B B B  >  R R R   B B B
     *   R R R   B B B     B B B   R R R
     */
    private fun swapBottomToBottom(aFace: Face, bFace: Face) {
        swap(aFace, 6, bFace, 6)
        swap(aFace, 7, bFace, 7)
        swap(aFace, 8, bFace, 8)
    }

    /**
     * Swaps the bottom layer with the left layer between two faces.
     *
     *   R R R   B B B     R R R   R B B
     *   R R R   B B B  >  R R R   R B B
     *   R R R   B B B     B B B   R B B
     */
    private fun swapBottomToLeft(aFace: Face, bFace: Face) {
        swap(aFace, 6, bFace, 0)
        swap(aFace, 7, bFace, 3)
        swap(aFace, 8, bFace, 6)
    }

    /**
     * Swaps the bottom layer with the right layer between two faces.
     *
     *   R R R   B B B     R R R   B B R
     *   R R R   B B B  >  R R R   B B R
     *   R R R   B B B     B B B   B B R
     */
    private fun swapBottomToRight(aFace: Face, bFace: Face) {
        swap(aFace, 6, bFace, 2)
        swap(aFace, 7, bFace, 5)
        swap(aFace, 8, bFace, 8)
    }

    /**
     * Swaps the left layer with the left layer between two faces.
     *
     *   R R R   B B B     B R R   R B B
     *   R R R   B B B  >  B R R   R B B
     *   R R R   B B B     B R R   R B B
     */
    private fun swapLeftToLeft(aFace: Face, bFace: Face) {
        swap(aFace, 0, bFace, 0)
        swap(aFace, 3, bFace, 3)
        swap(aFace, 6, bFace, 6)
    }

    /**
     * Swaps the left layer with the right layer between two faces.
     *
     *   R R R   B B B     B R R   B B R
     *   R R R   B B B  >  B R R   B B R
     *   R R R   B B B     B R R   B B R
     */
    private fun swapLeftToRight(aFace: Face, bFace: Face) {
        swap(aFace, 0, bFace, 2)
        swap(aFace, 3, bFace, 5)
        swap(aFace, 6, bFace, 8)
    }

    /**
     * Swaps the right layer with the left layer between two faces.
     *
     *   R R R   B B B     R R B   R B B
     *   R R R   B B B  >  R R B   R B B
     *   R R R   B B B     R R B   R B B
     */
    private fun swapRightToLeft(aFace: Face, bFace: Face) {
        swap(aFace, 2, bFace, 0)
        swap(aFace, 5, bFace, 3)
        swap(aFace, 8, bFace, 6)
    }

    /**
     * Swaps the right layer with the right layer between two faces.
     *
     *   R R R   B B B     R R B   B B R
     *   R R R   B B B  >  R R B   B B R
     *   R R R   B B B     R R B   B B R
     */
    private fun swapRightToRight(aFace: Face, bFace: Face) {
        swap(aFace, 2, bFace, 2)
        swap(aFace, 5, bFace, 5)
        swap(aFace, 8, bFace, 8)
    }

    /**
     * Swaps two cells at given indices between two faces.
     */
    private fun swap(aFace: Face, aIndex: Int, bFace: Face, bIndex: Int) {
        val tmp = bFace.tiles[bIndex]
        bFace.tiles[bIndex] = aFace.tiles[aIndex]
        aFace.tiles[aIndex] = tmp
    }
}