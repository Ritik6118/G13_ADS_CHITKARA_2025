package Lecture_06;

import java.util.*;

public class Merge_K_Soted_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode solve(ListNode[] arr) {
		PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode l1,ListNode l2) {
				return l1.val-l2.val;
			}
		});
		for(ListNode n:arr) {
			while(n!=null) {
				pq.add(n);
				n=n.next;
			}
		}
		ListNode temp=new ListNode();
		ListNode ans=temp;
		while(!pq.isEmpty()) {
			temp.next=pq.poll();
			temp=temp.next;
		}
		return ans.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
