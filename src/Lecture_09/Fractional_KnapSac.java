package Lecture_09;

import java.util.*;

public class Fractional_KnapSac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	double fractionalKnapsack(int[] values, int[] weights, int cap) {
        // code here
		PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair p1, Pair p2) {
				// TODO Auto-generated method stub
				double r1=(p1.val*1.0)/(p1.weight*1.0);
				double r2=(p2.val*1.0)/(p2.weight*1.0);
				if(r2-r1>0) {
					return 1;
				}
				else if(r2-r1==0) {
					return 0;
				}
				else{
					return -1;
				}	
			}
		});		
		for(int i=0;i<values.length;i++) {
			pq.add(new Pair(values[i],weights[i]));
		}
		double ans=0;
		while(!pq.isEmpty()) {
			Pair p=pq.poll();
			if(p.weight<=cap) {
				ans+=p.val;
				cap-=p.weight;
			}
			else {
				double valofunit=(p.val*1.0/p.weight*1.0);// value of one unit of item 
				ans+=(cap*valofunit);// value of units we are adding to knapsac
				break;
			}
		}
		
        return ans;
    }

}
class Pair{
	int val;
	int weight;
	Pair(int v,int w){
		val=v;
		weight=w;
	}
}