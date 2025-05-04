package Lecture_15;

import java.util.HashMap;

public class Graph {
	HashMap<Integer,HashMap<Integer,Integer>> map;
	Graph(){
		map=new HashMap<>();
	}
	
	public void addVertex(int v1) {
		map.put(v1, new HashMap<>());
	}
	public void removeVertex(int v1) {
		for(int i: map.get(v1).keySet()) {
			map.get(i).remove(v1);
		}
		map.remove(v1);
	}
	public void addEdge(int v1,int v2,int wt) {
		map.get(v1).put(v2, wt);
		map.get(v2).put(v1, wt);
	}
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	public void display() {
		for(int i:map.keySet()) {
			System.out.println(i+" --> "+map.get(i));
		}
	}
	public boolean Hashpath(int src,int des) {
		
	}
	
}
