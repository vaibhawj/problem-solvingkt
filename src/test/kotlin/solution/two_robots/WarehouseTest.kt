package solution.two_robots

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WarehouseTest {

    @Test
    fun test1() {
        val warehouse = Warehouse(listOf("1 5", "3 2", "4 1", "2 4"))

        assertEquals(11, warehouse.executeQueries())
    }

    @Test
    fun test2() {
        val warehouse = Warehouse(listOf("1 2", "4 3"))

        assertEquals(2, warehouse.executeQueries())
    }

    @Test
    fun test3() {
        val warehouse = Warehouse(listOf("2 4", "5 4", "9 8"))

        assertEquals(5, warehouse.executeQueries())
    }
}