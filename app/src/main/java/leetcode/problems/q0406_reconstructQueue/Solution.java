package leetcode.problems.q0406_reconstructQueue;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //greedy
        if(people==null || people.length==0){
        	return null;
        }
        int[][] result = new int[people.length][2];
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<List<Integer>> unassigned = new ArrayList<List<Integer>>();

        for (int i=0;i<people.length;i++) {
        	List<Integer> temp = new ArrayList<Integer>();
        	temp.add(people[i][0]);
        	temp.add(people[i][1]);
        	unassigned.add(temp);
        }

        while(unassigned.size() > 0){
        	List<Integer> current = unassigned.get(0);
        	boolean flag = false;
        	for (int i=0;i<=resultList.size();i++) {
        		if(helper(i,current,resultList)){
        			unassigned.remove(current);
        			resultList.add(i,current);
        			flag = true;
        			break;
        		}
        	}
        	if(flag == false){
				unassigned.remove(current);
	        	unassigned.add(current);
        	}
        }

        for (int i=0;i<resultList.size();i++) {
        	result[i][0] = resultList.get(i).get(0);
        	result[i][1] = resultList.get(i).get(1);
        }
        return result;
    }

    public boolean helper(int insertIndex,List<Integer> current, List<List<Integer>> resultList) {
    	if(insertIndex==0){
    		//check left in special case
    		if(current.get(1)!=0){
    			return false;
    		}
    		if(resultList.size()==0){
    			return true;
    		}
    		return checkRight(0,resultList.size()-1,current,resultList);
    	}
    	if(insertIndex==resultList.size()){
    		return checkLeft(0,resultList.size()-1,current,resultList);
    	}
    	return checkLeft(0,insertIndex-1,current,resultList) && checkRight(insertIndex,resultList.size()-1,current,resultList);
    }

    public boolean checkLeft(int from, int to, List<Integer> current, List<List<Integer>> resultList){
    	int count = 0;
    	int h = current.get(0);
    	int k = current.get(1);
    	for (int i=from;i<=to;i++) {
    		if(resultList.get(i).get(0) >= h){
    			count++;
    		}
    	}
    	return count==k;
    }

    public boolean checkRight(int from, int to, List<Integer> current, List<List<Integer>> resultList){
    	int h = current.get(0);
    	for (int i=from;i<=to;i++) {
    		if(h >= resultList.get(i).get(0)){
    			return false;
    		}
    	}
    	return true;
    }
}
