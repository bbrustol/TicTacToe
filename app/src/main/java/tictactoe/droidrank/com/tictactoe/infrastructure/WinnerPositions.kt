package tictactoe.droidrank.com.tictactoe.infrastructure

class WinnerPositions private constructor() {
    companion object {
        private val pos0 = intArrayOf(
            1, 1, 1,
            0, 0, 0,
            0, 0, 0
        )

        private val pos1 = intArrayOf(
            0, 0, 0,
            1, 1, 1,
            0, 0, 0
        )

        private val pos2 = intArrayOf(
            0, 0, 0,
            0, 0, 0,
            1, 1, 1
        )

        private val pos3 = intArrayOf(
            1, 0, 0,
            1, 0, 0,
            1, 0, 0
        )

        private val pos4 = intArrayOf(
            0, 1, 0,
            0, 1, 0,
            0, 1, 0
        )

        private val pos5 = intArrayOf(
            0, 0, 1,
            0, 0, 1,
            0, 0, 1
        )

        private val pos6 = intArrayOf(
            1, 0, 0,
            0, 1, 0,
            0, 0, 1
        )

        private val pos7 = intArrayOf(
            0, 0, 1,
            0, 1, 0,
            1, 0, 0
        )

        val winnerPositions: Array<IntArray> = arrayOf(pos0, pos1, pos2, pos3, pos4, pos5, pos6, pos7)
    }
}