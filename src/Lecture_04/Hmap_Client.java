package Lecture_04;

public class Hmap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hmap<Integer,Integer> map=new Hmap<>();
		map.put(1,1);
		System.out.println(map);
		map.put(2,1);
		map.put(3,1);
		map.put(1,2);
		map.remove(1);
		boolean a=map.containsKey(1);
		System.out.println(a);
		
	}

}
