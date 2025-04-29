package Lecture_16;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Provinces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int Component() {
		int c=0;
		HashSet<Integer> vis=new HashSet<>();
		Queue<Integer> q=new LinkedList<>();
		for(int i:map.keySet()) {
			if(!vis.contains(vis)) {
				q.add(i);
				c++;
				while(!q.isEmpty()) {
					int n=q.poll();
					if(vis.contains(n)) {
						continue;
					}
					
					vis.add(n);
					for(int j:map.get(n).keySet()) {
						if(!vis.contains(j)) {
							q.add(j);
						}
					}
				}
			}
			
		}
		return c;
	}

}
