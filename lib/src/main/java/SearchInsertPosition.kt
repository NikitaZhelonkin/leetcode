class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            when {
                nums[mid] > target -> end = mid - 1
                nums[mid] < target -> start = mid + 1
                else -> return mid
            }
        }
        return start
    }
}
