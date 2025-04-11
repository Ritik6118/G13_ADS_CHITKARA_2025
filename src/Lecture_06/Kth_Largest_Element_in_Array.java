package Lecture_06;
import java.util.*;
public class Kth_Largest_Element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solve(int [] arr,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>=pq.peek()) {
				pq.add(arr[i]);
				pq.poll();
			}
		}
		return pq.poll();
	}

}
