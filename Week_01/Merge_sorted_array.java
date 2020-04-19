import java.util.Arrays;

// 88. 合并两个有序数组
public class Merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1; // 放元素的尾部
        int tail1 = m - 1; // 数组一的尾部
        int tail2 = n - 1; // 数组二的尾部
        while (tail2 >= 0) {
            if (tail1 < 0) { // 这一行是把下面注释的while简化到这里了
                nums1[index--] = nums2[tail2--];
            } else if (nums1[tail1] >= nums2[tail2]) {
                nums1[index--] = nums1[tail1--];
            } else { // nums1[tail1] < nums2[tail2]
                nums1[index--] = nums2[tail2--];
            }
        }
    }
}
