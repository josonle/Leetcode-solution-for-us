import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int[] array={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                array[0]=map.get(target-nums[i]);
                array[1]=i;
                return array;
            }
            map.put(nums[i],i);
        }
        return array;
    }
}