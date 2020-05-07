object RotatorFactory {
    fun create(cube: Cube): RotatorInterface {
        when (cube.size) {
            3 -> return Rotator3x3x3(cube)
            else -> error("Cube size not supported.")
        }
    }
}