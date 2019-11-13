public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l != r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return target > nums[l] ? l + 1 : l;
    }


    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6, 8}, 7));//2
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));//1
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7));//4
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 0));//0
    }
}
