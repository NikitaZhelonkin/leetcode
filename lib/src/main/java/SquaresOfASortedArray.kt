class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var start = 0
        var end = nums.size - 1
        var k = nums.size - 1
        while (start <= end) {
            val squareStart = nums[start] * nums[start]
            val squareEnd = nums[end] * nums[end]
            result[k] = if (squareStart > squareEnd) {
                start++
                squareStart
            } else {
                end--
                squareEnd
            }
            k--

        }
        return result
    }
}
