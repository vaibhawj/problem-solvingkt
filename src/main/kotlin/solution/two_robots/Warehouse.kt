package solution.two_robots

class Warehouse(private val queries: List<String>) {

    fun executeQueries(): Int {
        val r1 = Robot()
        val r2 = Robot()

        return executeQueries(r1, r2, queries.map {
            Query(it.split(" ")[0].trim().toInt(), it.split(" ")[1].trim().toInt())
        }, 0)

    }

    private fun executeQueries(r1: Robot, r2: Robot, queries: List<Query>, dist: Int): Int {

        if(queries.isEmpty()) {
            return dist
        }

        val query = queries[0]

        return minOf(executeQueries(r1, r2, queries.subList(1, queries.lastIndex + 1), dist + r1.move(query.start, query.end)),
            executeQueries(r1, r2, queries.subList(1, queries.lastIndex + 1), dist + r2.move(query.start, query.end)))
    }
}

class Query(val start: Int, val end: Int)