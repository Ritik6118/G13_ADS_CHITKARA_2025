package Lecture_01;

import java.util.HashMap;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,12,2,3,2,1,2,34,5,6,78,6,4,35,6,86,432,2};
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int pfreq=map.get(arr[i]);
				map.put(arr[i], pfreq+1);
			}
			else {
				map.put(arr[i], 1);
			}
			
		}
		
		System.out.println(map);
	}

}
