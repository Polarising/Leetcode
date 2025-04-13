package leetcode.problems.q0338_countBits;

public class Solution {
    public int[] countBits(int num) {
        int[] counts = new int[num+1];
        for(int i=0; i<=num; i++){
            counts[i] = Integer.bitCount(i);
        }
        return counts;
    }
}
