/**
 * A face of Rubik's Cube of the given color and size.
 */
class Face(private val color: Color, size: Int) {
    /**
     * The cells of the face indexed from top left to bottom right.
     *
     * For example a 3x3x3 cube would represented as:
     *
     *   0 1 2
     *   3 4 5
     *   6 7 8
     *
     * A new face is always a single color until scrambled.
     */
    val tiles = Array(size * size) { _ -> color }

    override fun toString(): String {
        return color.toString() + ": " + tiles.joinToString("")
    }
}