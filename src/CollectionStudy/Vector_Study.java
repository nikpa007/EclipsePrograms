package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) 
	{
		
         Vector vk= new Vector();
         
         //vk.add("Captain");
         vk.add("Kohli");
         vk.add("Kohli");
         vk.add(null);
         vk.add(null);
         vk.add(200);
         vk.add(58.6);
         vk.add(true);
        
         
         
         System.out.println(vk);
         System.out.println("===================================================");
         System.out.println(vk.size());
         System.out.println(vk.get(5));
         System.out.println(vk.isEmpty());
         System.out.println(vk.remove(2));		
         System.out.println("==================================================");
         System.out.println(vk);

         //For loop
         
         System.out.println("===========    For Loop  ============");
         for(int i=0;i<=vk.size()-1;i++)
         {
        	 System.out.println(vk.get(i));
         }
         
         //For Each Loop
         
         System.out.println("===========    For Each Loop  ============");
         
         for(Object kv:vk)
         {
        	 System.out.println(kv);
         }
         
         //Iterator
         
         System.out.println("===========   Iterator  ============");
         
         Iterator cv= vk.iterator();
         
         while(cv.hasNext())
         {
        	 System.out.println(cv.next()+" ");
         }
         
         System.out.println("===========   ListIterator  ============");
         
         ListIterator nm=vk.listIterator();
         
         while(nm.hasNext())
         {
        	 System.out.println(nm.next()+" ");
         }
         
         //Enumeration
         
         System.out.println("===========   Enumeration  ============");
         
         Enumeration en=vk.elements();
         
         while(en.hasMoreElements())
         {
        	 System.out.println(en.nextElement());
         }
         
         //By using non generic method
         
         Vector<Integer> vi= new Vector<>();
         
         vi.add(21);
         vi.add(12);
         vi.add(21);
         vi.add(12);
         
         for(Integer po:vi)
         {
        	 System.out.println(po);
         }
	}

}
