package Lecture_09;

public class chek_if_kth_bit_is_on {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=3;
		if((n&(int)(Math.pow(2, k)))!=0){
			System.out.println(true);
		}
		else {
			System.out.println(false);			
		}
		int mask=1;
		mask<<=k-1;
		if((n&mask)!=0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
