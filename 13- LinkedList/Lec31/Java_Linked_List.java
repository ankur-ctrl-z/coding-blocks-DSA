package Lec31;

import java.util.Iterator; 
import java.util.LinkedList; 

public class Java_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// addlast
		ll.addFirst(20);
		ll.add(30);
		ll.add(1, -9);// 1st index pe -9 add kr deag
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(1));
		System.out.println(ll.remove());// remove first
		System.out.println(ll.removeLast());// remove last
		System.out.println(ll.remove(1));// reamove at index
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();

		// address
		Iterator<Integer> a = ll.iterator();
		while (a.hasNext()) {// .hasNext will check if there is any node after the current one
			System.out.print(a.next() + " ");// .next will print the value of current node and will point to next node
		}

	}

}

// hasNext():
// Checks if there’s another element in the collection.
// Returns true if there’s a next item, false if you’ve reached the end.

// next():
// Gives you the next element in the collection and moves the pointer forward.
// Think of it like pressing "Next" on your remote.

// remove():
// Removes the last item returned by next() (optional and not commonly used)
