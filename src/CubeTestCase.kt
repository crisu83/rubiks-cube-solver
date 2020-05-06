import junit.framework.TestCase

open class CubeTestCase : TestCase() {
    fun assertCube(cube: Cube, actual: String) {
        assertEquals(cube.toString(), actual.trimIndent())
    }

    fun createCube(size: Int = 3): Cube {
        return Cube(size)
    }
}