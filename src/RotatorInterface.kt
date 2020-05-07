/**
 * Rotator service interface.
 *
 * All rotator implementations should implement this interface.
 */
interface RotatorInterface {
    /**
     * Rotates the face of the given color in the given direction.
     */
    fun rotate(color: Color, direction: Direction)
}