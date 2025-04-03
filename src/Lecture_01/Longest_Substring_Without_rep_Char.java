package Lecture_01;

import java.util.HashMap;

public class Longest_Substring_Without_rep_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	public static int lengthOfLongestSubstring(String s) {
        int si=0;// sliding windows starting index
        int ei=0;// sliding window's ending index
        HashMap<Character,Integer> map=new HashMap<>();// to calculate freq for duplicacy check
        int max=0;// to collect the max ans
        
        while(ei<s.length()) {
        	char ch_at_ei=s.charAt(ei);
        	
        	if(map.containsKey(ch_at_ei)) {
        		int curr_freq=map.get(ch_at_ei);
        		map.put(ch_at_ei, curr_freq+1);
        	}
        	else {
        		map.put(ch_at_ei, 1);
        	}
        	//expansion of window
        	
        	while(map.get(ch_at_ei)>1 && si<ei) {
        		char ch_at_si=s.charAt(si);
        		int curr_freq=map.get(ch_at_si);
        		map.put(ch_at_si, curr_freq-1);
        		si++;
        	}
        	// shrinking of window
        	
        	max=Math.max(max, ei-si+1);
        	// calculation of answer
        	ei++;
        }
        
		return max;
    }

}
