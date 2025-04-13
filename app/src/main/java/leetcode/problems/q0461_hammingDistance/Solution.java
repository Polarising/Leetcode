package leetcode.problems.q0461_hammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        // //method 1
        // int z = x ^ y; // x XOR y
        // String binaryString = Integer.toBinaryString(z);
        // char[] binaryChar = binaryString.toCharArray();
        // int distance = 0;
        // for(char ch : binaryChar){
        //     if(ch == '1'){
        //         distance++;
        //     }
        // }
        // return distance;
        
        //method 2
        return Integer.bitCount(x ^ y);
    }
}
