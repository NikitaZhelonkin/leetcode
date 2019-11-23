import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = copy[i];
        }
    }


    public static void main(String[] args){
        RotateArray rotateArray = new RotateArray();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

}
