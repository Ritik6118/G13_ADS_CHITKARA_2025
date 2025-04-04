package Lecture_04;

import java.util.HashMap;

public class Isomorphic_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(map.containsKey(cs)){
                if(map.get(cs)!=ct){
                    return false;
                }
            }
            else{
                if(map.containsValue(ct)){
                    return false;
                }
                map.put(cs,ct);
            }
        }

        return true;
    }
}
