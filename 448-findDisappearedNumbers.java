public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // //method 1
        // List<Integer> result = new ArrayList<Integer>();
        // if(nums==null || nums.length==0){
        // 	return result;
        // }

        // Set<Integer> set = new HashSet<Integer>();
        // for (int value : nums) {
        // 	set.add(value);
        // }
        // for (int i=1; i<=nums.length ; i++ ) {
        // 	if(!set.contains(i)){
        // 		result.add(i);
        // 	}
        // }
        // return result;

        //method 2
        List<Integer> result = new ArrayList<Integer>();
        if(nums==null || nums.length==0){
            return result;
        }
        for (int i=0; i<nums.length ; i++ ) {
            //get the value of each index
            int value = nums[i];
            //use this value as new index, mark the new index as visited by turning the value of the index to negative
            int newIndex = Math.abs(value)-1;
            if(nums[newIndex] > 0){
                nums[newIndex] = -nums[newIndex];
            }
        }
        for (int i=0;i<nums.length;i++ ) {
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}