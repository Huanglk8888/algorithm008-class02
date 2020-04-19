//283.移动零
public class Move_zeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
                if (index != (i + 1)) {
                    nums[i] = 0;
                }
            }
        }
    }
}
