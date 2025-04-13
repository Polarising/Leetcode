package leetcode.problems.q0344_reverseString;

public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return sb.toString();
    }
}
