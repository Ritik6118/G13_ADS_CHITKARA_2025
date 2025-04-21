package Lecture_11;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Integer[] dp;
	public int rob(int[] nums) {
		dp=new Integer[nums.length];
		return solve(0,nums);
	}
	private int solve(int idx, int[] arr) {
		// TODO Auto-generated method stub
		if(idx>=arr.length) {
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		int p=arr[idx]+solve(idx+2,arr);
		int np=solve(idx+1,arr);
		return dp[idx]=Math.max(p, np);
	}

}
