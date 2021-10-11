class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var k = 0
        for (i in nums.indices) {
            if (nums[i] != 0) nums[k++] = nums[i]
        }
        while (k<nums.size){
            nums[k++] = 0
        }

    }
}
