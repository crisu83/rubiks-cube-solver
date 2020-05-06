/**
 * A Rubik's Cube of the given size.
 *
 * Please note that currently only 3x3x3 cubes are supported.
 */
class Cube(size: Int = 3) {
    /**
     * The six faces of the cube (from top to bottom: WHITE, RED, BLUE, ORANGE, GREEN, YELLOW).
     *
     * For example a 3x3x3 cube would represented as:
     *
     *         W0W1W2
     *         W3W4W5
     *         W6W7W8
     *   G0G1G2R0R1R2B0B1B2O0O1O3
     *   G3G4G5R3R4R5B3B4B5O3O4O5
     *   G6G7G8R6R7R8B6B7B8O6O7O8
     *         Y0Y1Y2
     *         Y3Y4Y5
     *         Y6Y7Y8
     */
    private val faces = arrayOf(
        createFace(Color.WHITE, size),
        createFace(Color.RED, size),
        createFace(Color.BLUE, size),
        createFace(Color.ORANGE, size),
        createFace(Color.GREEN, size),
        createFace(Color.YELLOW, size)
    )

    fun getFace(color: Color): Face {
        return faces[color.ordinal]
    }

    private fun createFace(color: Color, size: Int): Face {
        return Face(color, size)
    }

    override fun toString(): String {
        return faces.joinToString("\n")
    }
}