package CollectionProgram;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList L=new LinkedList();
		L.add(10);
		L.add(20);
		L.add("INDIA");
		L.add('A');
		L.add(null);
		L.add(null);
		System.out.println(L);
		System.out.println(L.size());
		System.out.println(L.get(3));
		System.out.println(L.remove(4));
		System.out.println(L.isEmpty());
		System.out.println(L.contains("Jay Hind"));
        L.clear();		
        System.out.println(L);
	}

}
