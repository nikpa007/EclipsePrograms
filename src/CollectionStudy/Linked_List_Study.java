package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List_Study {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList<>();
		
		ll.add("Pune");
		ll.add("Pune");
		ll.add("pune");
		ll.add('P');
		ll.add(420);
		ll.add(12.366);
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(false);
		ll.add(true);
		
		
		System.out.println(ll);
		System.out.println(ll.contains("pune"));
		System.out.println(ll.equals("Pune"));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		//System.out.println(ll.clone());
		System.out.println(ll.remove(2));
		//System.out.println(ll);
		
		
		//1.for loop
		System.out.println("==========For Loop=========");
		for(int i=1;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		//2.ForEachLoop
		System.out.println("========ForEachLoop=======");
		
		for(Object p:ll)
		{
			System.out.println(p);
		}
		
		//3.Iterator
		System.out.println("=========Iterator=========");
		
		Iterator tt=ll.iterator();
		
		while(tt.hasNext())
		{
			System.out.println(tt.next());
		}
			
		//4.ListIterator
		System.out.println("==========ListIterator=========");
			
		ListIterator i= ll.listIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
			
		LinkedList<String> st= new LinkedList<>();
		
		st.add("ByUsing");
		st.add("String");
		st.add("DataType");
		st.add("With");
		st.add("NonGeneric");
		st.add("Type");
		System.out.println("==========NonGeneric==========");
		System.out.println(st);
		
		//ForEach
		System.out.println("=============ForEach==========");
		for(String u:st)
		{
			System.out.println(u);
		}
		
	}

}
