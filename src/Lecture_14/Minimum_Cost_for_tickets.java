package Lecture_14;

public class Minimum_Cost_for_tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] days= {1,4,6,7,8,20};
		int [] costs= {2,7,15};
		System.out.println(mincostTickets(days,costs));
	}
	public static int mincostTickets(int[] days, int[] costs) {
        int [] freq  =new int[366];
        for(int i:days) {
        	freq[i]++;
        }
        dp=new Integer[366];
        return solve(0,freq,costs);
    }
	static Integer[] dp;
	private static int solve(int i, int[] freq, int[] costs) {
		// TODO Auto-generated method stub
		if(i>=freq.length) {
			return 0;
		}
		if(dp[i]!=null) {
			return dp[i];
		}
		if(freq[i]==0) {
			return solve(i+1,freq,costs);
		}
		int a=costs[0]+solve(i+1,freq,costs);
		int b=costs[1]+solve(i+7,freq,costs);
		int c=costs[2]+solve(i+30,freq,costs);
		return dp[i]=Math.min(a, Math.min(b, c));
	}

}
