/**
 * A Rubik's Cube of the given size.
 */
class Cube(size: Int = 3) {
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