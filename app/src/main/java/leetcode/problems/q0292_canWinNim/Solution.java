package leetcode.problems.q0292_canWinNim;

public class Solution {
    public boolean canWinNim(int n) {
    	//4,8,12...can't win
        return n%4!=0;
    }
}
