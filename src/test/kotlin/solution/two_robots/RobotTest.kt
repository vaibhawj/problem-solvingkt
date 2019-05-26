package solution.two_robots

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RobotTest {

    @Test
    fun move() {
        val robot = Robot(5)
        assertEquals(4, robot.move(4, 1))
        assertEquals(1, robot.pos)
    }

    @Test
    fun moveFromAPos() {
        val robot = Robot(5)
        assertEquals(7, robot.move(1, 4))
        assertEquals(4, robot.pos)
    }

    @Test
    fun moveFromInitialPos() {
        val robot = Robot()
        assertEquals(3, robot.move(4, 1))
        assertEquals(1, robot.pos)
    }
}