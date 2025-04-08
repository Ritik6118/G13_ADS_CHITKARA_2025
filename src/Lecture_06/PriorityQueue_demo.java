package Lecture_06;
import java.util.*;
public class PriorityQueue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(4);
		pq.add(1);
		pq.add(6);
		pq.add(3);
		pq.add(5);
		pq.add(2);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
