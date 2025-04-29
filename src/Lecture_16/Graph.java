package Lecture_16;

import java.util.*;
import java.util.HashSet;

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
		HashSet<Integer> vis =new HashSet<>();
		return Haspath(src,des,vis);
		
	}

	private boolean Haspath(int src, int des, HashSet<Integer> vis) {
		// TODO Auto-generated method stub
		if(des==src) {
			return true;
		}
		vis.add(src);
		for(int i: map.get(src).keySet()) {
			if(!vis.contains(i)) {
				if(Haspath(i,des,vis)) {
					return true;
				}
			
			}
		}
		return false;
	}
	public boolean bfs(int src,int des) {
		Queue<Integer> q=new LinkedList<>();
		HashSet<Integer> vis=new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			int n=q.poll();
			if(n==des) {
				return true;
			}
			if(vis.contains(n)) {
				continue;
			}
			vis.add(n);
			for(int i:map.get(n).keySet()) {
				if(!vis.contains(i)) {
					q.add(i);
				}
			}
		}
		return false;
	}
	public boolean dfs(int src,int des) {
		Stack<Integer> st=new Stack<>();
		HashSet<Integer> vis=new HashSet<>();
		st.add(src);
		while(!st.isEmpty()) {
			int n=st.pop();
			if(n==des) {
				return true;
			}
			if(vis.contains(n)) {
				continue;
			}
			vis.add(n);
			for(int i:map.get(n).keySet()) {
				if(!vis.contains(i)) {
					st.push(i);
				}
			}
		}
		return false;
	}
	public void bft() {
		HashSet<Integer> vis=new HashSet<>();
		Queue<Integer> q=new LinkedList<>();
		for(int i:map.keySet()) {
			if(!vis.contains(vis)) {
				q.add(i);
				while(!q.isEmpty()) {
					int n=q.poll();
					if(vis.contains(n)) {
						continue;
					}
					System.out.println(n);
					vis.add(n);
					for(int j:map.get(n).keySet()) {
						if(!vis.contains(j)) {
							q.add(j);
						}
					}
				}
			}
		}
	}
}
