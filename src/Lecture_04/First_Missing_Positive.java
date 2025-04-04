package Lecture_04;

import java.util.HashMap;

public class First_Missing_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int firstMissingPositive(int[] nums) {
	        // using hashMap
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int i:nums){
	            if(i>0){
	                map.put(i,i);
	            }
	        }
	        for(int i=1;i<=nums.length+1;i++){
	            if(!map.containsKey(i)){
	                return i;
	            }
	        }
	        return -1;
	    }

}
