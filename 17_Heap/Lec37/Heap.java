package Lec37;

import java.util.ArrayList;

public class Heap {
	// ArrayList can hold only objects, so we have to use Integer instead of int
	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);// doing this because of zero baseed indx Of array as new element is added at
									// last of arraylist
	} 

	// In a Min-Heap, the parent node should always be smaller than its child nodes.
	// upheapify moves an inserted element upward until the Min-Heap property is
	// restored.
	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;// find the parent index
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);

		}

	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll);
	}

	public int remove() {
		swap(0, ll.size() - 1);// removng the last element and swapping it with the root element becuase
								// removing the root element will in O(1) time
		int rv = ll.remove(ll.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	private void swap(int i, int j) {
		int ith = ll.get(i);
		int jth = ll.get(j);
		ll.set(i, jth);
		ll.set(j, ith);

	}

}

// In a heap, elements keep changing dynamically (insertions & deletions). Since
// ArrayList resizes automatically, it is an ideal choice for implementing a
// dynamic Min-Heap
