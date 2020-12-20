package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
给定一个整数数组，判断是否存在重复元素。

如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。

示例：
输入：[1,2,3,1] 输出：true
输入：[1,2,3,4] 输出：false
 */

public class ContainsDuplicate {
    public boolean HashTable(int [] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }
        return false;
    }
    public boolean ArraySort(int [] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
