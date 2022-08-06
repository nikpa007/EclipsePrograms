package CollectionProgram;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		       ArrayList L=new ArrayList();
		       L.add(10);
		       L.add(20);
		       L.add("INDIA");
		       L.add('A');
		       L.add(40.55);
		       L.add(null);
		       L.add(null);
		       L.add(20);
		       System.out.println(L);
		       System.out.println(L.size());
		       System.out.println(L.get(1));
		       System.out.println(L.lastIndexOf(L));
		       System.out.println(L.set(2, "Jay Hind"));
		       System.out.println(L.remove(5));
		       System.out.println(L.isEmpty());
		       System.out.println(L.contains("Jay Hind"));
		       
	}

}
