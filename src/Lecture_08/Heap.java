package Lecture_08;

import java.util.ArrayList;

public class Heap<T extends Comparable> {
	
	private ArrayList<T> li;
	
	private int parent(int idx) {
		return (idx-1)/2;
	}
	
	private int leftchild(int idx) {
		return (2*idx)+1;
	}
	
	private int rightchild(int idx) {
		return (2*idx)+2;
	}
	
	private void swap(int i,int j) {
		T temp=li.get(i);
		li.set(i, li.get(j));
		li.set(j, temp);
	}
	Heap(){
		li=new ArrayList<>();
	}
	
	public void add(T val) {
		li.add(val);
		upheapify(li.size()-1);
	}
	
	private void upheapify(int idx) {
		// TODO Auto-generated method stub
		if(idx==0) {
			return;
		}
		int p=parent(idx);
		
		if(li.get(idx).compareTo(li.get(p))<0) {
			swap(idx,p);
			upheapify(p);
		}
	}

	public T poll() {
		if(li.size()<=0) {
			System.out.println("heap is empty");
			return null;
		}
		T val=li.get(0);
		
		T last=li.get(li.size()-1);
		if(li.size()>0) {
			li.set(0, last);
			downheapify(0);
		}
		return val;
	}
	
	private void downheapify(int idx) {
		// TODO Auto-generated method stub
		int min=idx;
		int left=leftchild(idx);
		int right=rightchild(idx);
		
		if(left<li.size() && li.get(min).compareTo(li.get(left))>0) {
			min=left;
		}
		
		if(right<li.size() && li.get(min).compareTo(li.get(right))>0) {
			min=right;
		}
		if(idx!=min) {
			swap(min,idx);
			downheapify(min);
		}
		
	}

	public T peek() {
		return li.get(0);
	}
	
}
