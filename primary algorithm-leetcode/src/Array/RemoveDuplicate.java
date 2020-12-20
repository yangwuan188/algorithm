package Array;

import java.util.Arrays;

/*
给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

示例：
给定 nums = [0,0,1,1,1,2,2,3,3,4],

函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

 */
public class RemoveDuplicate {
    public void DoublePointer(int[] nums){
        if (nums.length <=1){
            System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, nums.length)) + ' ' + nums.length);
        }
        else{
            //快慢指针,i为慢指针,j为快指针
            int i = 0;
            for (int j = 1; j < nums.length ; j++) {
                // 出现不同元素,慢指针向后移动,用新出现的元素覆盖当前元素
                if (nums[j] != nums[i]){
                    i += 1;
                    nums[i] = nums[j];
                }
            }
            System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, i+1))+ ' ' + (i+1));
        }

    }
}
