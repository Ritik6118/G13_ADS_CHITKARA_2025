package Lecture_07;

import java.util.*;

public class Non_Overlapping_Integrvals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int eraseOverlapIntervals(int[][] arr) {
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] a1, int[] a2) {
				// TODO Auto-generated method stub
				return a1[1] - a2[1];
			}

		});
		for (int[] i : arr) {
			pq.add(i);
		}
		int[] interval = pq.poll();
		int ct = interval[1];
		int c = 1;

		while (!pq.isEmpty()) {
			interval = pq.poll();
			int st = interval[0];
			int et = interval[1];
			if (st >= ct) {
				c++;
				ct = et;
			}
		}
		return arr.length - c;
	}

}
