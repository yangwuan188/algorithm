package Array;
/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例：
给定 nums = [2, 7, 11, 15], target = 9
返回 [0,1]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] HashTableSingleInteration(int [] nums,int target){
        // 哈希表单次循环，数组元素值为key,索引为value
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 若哈希表中包含目标元素，储存两元素索引
            if(map.containsKey(complement)){
                result[0] = i;
                result[1] = map.get(complement);
            }
            else{
                // 若哈希表不包含，则添加
                map.put(nums[i],i);
            }
        }
        return result;
    }
    public int[] HashTableDoubleInteration(int []nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = new int [2];
        // 一次遍历将数组元素和索引储存至哈希表
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        // 二次遍历
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 哈希表中包含目标元素，且两元素索引不相等
            if (map.containsKey(complement) && i!= map.get(complement)){
                result[0] = i;
                result[1] = map.get(complement);
            }

        }
        return result;
    }

}
