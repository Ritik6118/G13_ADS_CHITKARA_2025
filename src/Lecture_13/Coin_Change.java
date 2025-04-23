package Lecture_13;

import java.util.*;

public class Coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 5 };

		System.out.println(coinChange(a, 11));
	}

	public static int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		dp=new Integer[coins.length][amount+1];
		int a = solve(coins, amount, coins.length - 1);
		if (a == (int) (1e9)) {
			return -1;
		}
		return a;
	}
	static Integer[][] dp;
	private static int solve(int[] coins, int amount, int i) {
		// TODO Auto-generated method stub

		if (i == 0) {
			if (amount % coins[i] == 0) {
				return amount / coins[i];
			} else {
				return (int) (1e9);
			}
		}
		if(dp[i][amount]!=null) {
			return dp[i][amount];
		}
		int pick = (int) (1e9);
		if (amount >= coins[i]) {
			pick = 1 + solve(coins, amount - coins[i], i);
		}
		int notpick = solve(coins, amount, i - 1);

		return dp[i][amount]=Math.min(pick, notpick);
	}

}
