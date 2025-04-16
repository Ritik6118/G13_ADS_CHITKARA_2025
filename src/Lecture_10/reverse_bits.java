package Lecture_10;

public class reverse_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Integer b=n;
		System.out.println(b.toBinaryString(n));
		int pos=0;
		int ans=0;
		while(n>0) {
			if((n&1)==1) {
				ans=(ans | (1<<(31-pos)));
			}
			n>>=1;
			pos++;
		}
		System.out.println(ans);
		Integer a=ans;
		System.out.println(a.toBinaryString(ans));
	}

}
