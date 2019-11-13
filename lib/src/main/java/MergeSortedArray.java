import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int t = m + n - 1; t >= 0; t--) {
            nums1[t] = n == 0 || (m!=0 && nums1[m - 1]  > nums2[n - 1]) ? nums1[--m] : nums2[--n];
        }

    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1};
        solution.merge(arr1, 0, arr2, 1);
        System.out.println(Arrays.toString(arr1));

    }
}
