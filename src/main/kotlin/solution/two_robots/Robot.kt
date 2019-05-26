package solution.two_robots

import kotlin.math.absoluteValue

class Robot(var pos: Int = 0) {

    fun move(start: Int, end: Int): Int {
        val dist = when (pos) {
            0 -> {
                (end - start).absoluteValue
            }
            else -> {
                (start - pos).absoluteValue + (end - start).absoluteValue
            }
        }
        pos = end
        return dist
    }
}