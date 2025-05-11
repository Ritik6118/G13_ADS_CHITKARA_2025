package Lecture_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int [] indegree=new int[V];
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<V;i++) {
        	li.add(new ArrayList<>());
        }
        for(int [] arr:edges) {
        	int v1=arr[0];
        	int v2=arr[1];
        	indegree[v2]++;
        }
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++) {
        	if(indegree[i]==0) {
        		q.add(i);
        	}
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()) {
        	int n=q.poll();
        	ans.add(n);
        	for(int i:li.get(n)) {
        		indegree[i]--;
        		if(indegree[i]==0) {
        			q.add(i);
        		}
        	}
        }
        return ans;
    }

}
