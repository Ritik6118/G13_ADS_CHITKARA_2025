package Lecture_12;

public class Longest_Common_Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		dp=new Integer[s1.length()][s2.length()];
		System.out.println(lcs(s1, s2, 0, 0));

	}
	static Integer[][] dp;

	private static int lcs(String s1, String s2, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=s1.length() || j>=s2.length()) {
			return 0;
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		int match=0;
		int not_match=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			match=1+lcs(s1,s2,i+1,j+1);
		}
		else {
			int stat_i=lcs(s1,s2,i,j+1);
			int stat_j=lcs(s1,s2,i+1,j);
			not_match=Math.max(stat_i, stat_j);
		}
		
		return dp[i][j]=Math.max(match, not_match);
		
	}

}
