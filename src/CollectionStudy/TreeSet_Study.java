package CollectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) 
	{
	
		TreeSet ts= new TreeSet<>();
		
		ts.add(12.36);
		//ts.add("float");
		ts.add(21.06);
		ts.add(256.389);
		//ts.add(null);
		//ts.add(true);
		//ts.add(null);
		ts.add(25.368);
		//ts.add('B');
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(25.368));
		System.out.println(ts.first());
		System.out.println(ts.last());
		//System.out.println(ts.);
		//System.out.println(ts.higher(ts));
		System.out.println(ts.isEmpty());
		//System.out.println(ts.ceiling(256.389));
		System.out.println("========================================");
		
		//for loop
//		for(int i=0;i<=ts.size()-1;i++)
//		{
//			System.out.println(ts);
//		}
		
		//for each
		for(Object st:ts)
		{
			System.out.println(st);
		}
		System.out.println("========================================");

		//Iterator
		
		Iterator as= ts.iterator();
		
		while(as.hasNext())
		{
			System.out.println(as.next());
		}
}

}
