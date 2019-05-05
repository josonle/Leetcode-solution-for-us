import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		int i=0,j=0;
		for(int k=0;k<nums.length-2;k++) {
            if(nums[k]>0)
                break;
            if(k>0&&nums[k]==nums[k-1])
                continue;
			i = k+1;
            j = nums.length-1;
			while(i<j) {
				int tmp = nums[i]+nums[j];
//				System.out.println(tmp+"-"+nums[k]);
				if(tmp+nums[k]>0) {
					j--;
				}else if (tmp+nums[k]<0) {
					i++;
				}else {
					list.add(Arrays.asList(nums[k],nums[i],nums[j]));
					while(i<j&&nums[i]==nums[i+1]) i++;
					while(i<j&&nums[j]==nums[j-1]) j--;
					i++;
					j--;
				}
			}
		}
		return list;
    }
}