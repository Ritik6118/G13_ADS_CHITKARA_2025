package Lecture_08;

public class Heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap<Integer> pq=new Heap<>();
		pq.add(9);
		pq.add(10);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(15);
		for(int i=0;i<6;i++) {
			System.out.println(pq.poll()); 
		}
			
	}

}
