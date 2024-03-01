package rep;

import java.util.ArrayList;
import java.util.List;

public class m1 {
	public String toString() {
		return "HI,sush";
	}
	
	
//	public static void main(String [] args) {
//		ArrayList list = new ArrayList();
//		
//		Integer i1 =4;
//			Integer i2 =5;
//		
//		list.add(i1);
//		list.add(i2);
//		list.add(10);
//	}
	
	
	public static void main(String [] args) {
		
		//overloading array
//		List list = new ArrayList();
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		list.add(3,30);
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list);
//		System.out.println(list.get(2));
//		
//	}
		
		//to get elements of array via index values
		List<Integer> list = new ArrayList<Integer>();
//		a1_coll collections1 = new a1_coll();
		
		list.add(3);
		list.add(1);
		list.add(10);
		list.add(3,30);
		Integer removalElement =3;
//		list.add("sush");
//		list.add(collections1);
//		for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
////		}
		for(int val:list) {
			System.out.println(val);
		}
		System.out.println(list.remove(1));
		System.out.println("After removal");
	
//		for(Object o:list) {
//			System.out.println(o);
//		}
		
		
		}

}

