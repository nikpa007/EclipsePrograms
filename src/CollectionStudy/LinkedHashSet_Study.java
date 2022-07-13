package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Study {

	public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet<>();
		
		lh.add("Nik");
		lh.add("Nik");
		lh.add("NikP");
		lh.add('N');
		lh.add('P');
		lh.add(21);
		lh.add(21.21);
		lh.add(true);
		lh.add(false);
		lh.add(null);
		lh.add(null);
		
		System.out.println(lh);
		System.out.println(lh.remove(false));
		System.out.println(lh.remove("Nik"));
		System.out.println(lh);
		System.out.println("=====================================");
	//for each
		
		for(Object hh:lh)
		{
			System.out.println(hh);
		}
		System.out.println("=====================================");

		//Iterator
		
		Iterator up=lh.iterator();
		
		while(up.hasNext())
		{
			System.out.println(up.next());
		}
		System.out.println("=====================================");

		//Non Generic ------- int
		
		LinkedHashSet<Integer> lt= new LinkedHashSet<>();
		
		lt.add(101);
		lt.add(201);
		lt.add(301);
		lt.add(501);
		lt.add(601);
		
		System.out.println(lt);
		System.out.println("=====================================");

		//for each
		
		for(Integer in:lt)
		{
			System.out.println(in);
		}
	}

}
