public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums==null || nums.length==0){
        	return result;
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int value : nums) {
        	set.add(value);
        }
        for (int i=1; i<=nums.length ; i++ ) {
        	if(!set.contains(i)){
        		result.add(i);
        	}
        }
        return result;
    }
}