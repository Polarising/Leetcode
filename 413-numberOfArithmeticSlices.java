public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
    	//method 1, math
        if(A==null || A.length<3){
        	return 0;
        }
        int number = 0;
        for (int start=0;start<A.length-2;start++) {
        	if((A[start+1]-A[start])==(A[start+2]-A[start+1])){
        		int end=start+2;
        		int distance = A[start+1]-A[start];
        		number++;
        		
        		end++;
        		while(end<A.length){
        			if((A[end]-A[end-1])==distance){
        				number++;
        				end++;
        			}else{
        				break;
        			}
        		}
        	}
        }
        return number;
    }
}