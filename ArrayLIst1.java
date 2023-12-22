package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIst1 {

	public static void main(String[] args) {
			ArrayList ar = new ArrayList();
			
// adding values to the arrayList and array list is index based data structure 
//follows insersion order
//			ar.add(12);
//			ar.add("ashish");
//			ar.add(11.00);
//			ar.add("kumarashish1504@gamil.com");
//			
//			System.out.println(ar);
			
// storring values maunaly to the index position 
//			ar.add(1, 12);
//			ar.add(0, "ashish");
//			ar.add(2, 11.00);
//			ar.add(3, "kumarashish1504@gamil.com");
//			
//			System.out.println(ar);
			
// addding dupplicate values to the Arraylist
//			ar.add(12);
//			ar.add("ashish");
//			ar.add("ashish");
//			ar.add("kumarashish1504@gamil.com");
//			
//			System.out.println(ar);
			
//array list does not follows shotring order
//			ar.add(12);
//			ar.add(7);
//			ar.add(11);
//			ar.add(9);
//			
//			System.out.println(ar);

// adding to array list in one array list
//			ar.add(12);
//			ar.add("ashish");
//			ar.add(11.00);
//			ar.add("kumarashish1504@gamil.com");
//			
//			ArrayList ar1 = new ArrayList();
//			ar1.add("shivam");
//			ar1.add(21);
//			
//			ar1.addAll(ar);
//			
//			System.out.println(ar1);
			
// removing elements form array list by object and 
//			ar.add(12);
//			ar.add("ashish");
//			ar.add(11.00);
//			ar.add("kumarashish1504@gamil.com");
//			
//			ArrayList ar1 = new ArrayList();
//			ar1.add("ashish");
//			ar1.add(21);
//			ar1.add(112);
//			
//			
////			ar1.addAll(ar);
//			
//			System.out.println(ar1);
//			
////			ar1.remove(1);
////			System.out.println(ar1);
//			ar1.removeAll(ar);
//			System.out.println(ar1);
//	
//clear the elements for array list
//			ar.add(12);
//			ar.add("ashish");
//			ar.add(11.00);
//			ar.add("kumarashish1504@gamil.com");
//			
//			ArrayList ar1 = new ArrayList();
//			ar1.add("ashish");
//			ar1.add(21);
//			ar1.add(112);
//			
//			ar.clear();
//			System.out.println(ar);
//			System.out.println(ar1);
		
// check that value element is present in the array list
			
			ar.add(12);
			ar.add("ashish");
			ar.add(11.00);
			ar.add("kumarashish1504@gamil.com");
			
			System.out.println(ar.contains("ashish"));
			System.out.println(ar.contains("ashish kumar dwivedi"));
			System.out.println(ar.size());
			System.out.println(ar.get(2));
		    ar.set(1, "shivam");
//		    System.out.println(ar); 
		    System.out.println(ar.indexOf(12));
// printing all the element in new line 
		    Iterator it = ar.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
			
	}

}
