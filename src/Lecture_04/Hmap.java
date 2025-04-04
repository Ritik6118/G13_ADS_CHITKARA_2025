package Lecture_04;

public class Hmap<K, V> {
	Hmap(int x){
		arr=new Node[x];
	}
	
	Hmap() {
		this(4);
	}
	class Node<K, V> {
		K key;
		V val;
		Node next;

		Node() {

		}

		Node(K key, V val) {
			this.key = key;
			this.val = val;
		}
	}

	// arr

	Node[] arr;

	// size
	int size;

	// put
	public void put(K key, V val) {
		int bn = hashfun(key);

		Node temp = arr[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}

		Node nn = new Node(key, val);
		nn.next = arr[bn];
		arr[bn] = nn;
		size++;

		double lf = (1.0 * size) / arr.length;
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	// remove
	public void remove(K key) {
		int bn = hashfun(key);
		Node curr = arr[bn];
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			// you can throw exception
			return;
		}
		if (prev == null) {
			arr[bn] = curr.next;
			curr.next = null;
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		size--;

	}

	// get
	public V get(K key) {
		int bn = hashfun(key);
		Node temp = arr[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return (V)(temp.val);
			}
			temp = temp.next;
		}
		return null;
	}

	// containsKey
	public boolean containsKey(K key) {
		int bn = hashfun(key);
		Node temp = arr[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	// hashfun---> return bucket number for array
	private int hashfun(K key) {
		int bn = key.hashCode() % arr.length;
		if (bn < 0) {
			bn += arr.length;
		}
		return bn;
	}

	// rehashing--> doubles the size of array to manage the increased load factor
	private void rehashing() {
		Node[] oa = this.arr;
		Node[] na = new Node[oa.length * 2];
		this.arr = na;
		size = 0;
		for (Node n : oa) {
//			n==head node
			while (n != null) {
				this.put((K) (n.key), (V) (n.val));
				n=n.next;
			}
		}
	}
	@Override
	public String toString() {
		String s="{ \n";
		for (Node n : arr) {
//			n==head node
			while (n != null) {
				s+="[ "+n.key+" = "+n.val+" ] \n";
				n=n.next;
			}
		}
		s+="} ";
		return s;
	}

}
