package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		  List obj=new ArrayList();//non generic array list 
		 obj.add("hi");//predefined add method
		 obj.add(23);
		 obj.add(23.4f);
		 obj.add('a');
	System.out.println(obj);
	 List<String> obj1 =new ArrayList();//generic
	obj1.add("arsha");
	obj1.add("ddddd");
	obj1.add("dwfff");
	System.out.println(obj1);

	 List<String> al =new ArrayList();
	al.add("sample");
	al.add("aaaa");
	al.addAll(obj1);//add all generic elemets togther from 2 collections 

	System.out.println(al);

	al.remove(3);// to remove the particular index value uath remove cheyn
	 System.out.println(al);

	 al.removeAll(al);//rremoving all elememts in collections 
	 System.out.println(al);
	 
	 List<String> cgh =new ArrayList();
	 cgh.add("hhhhhh");
	 cgh.add("welcome");
	 System.out.println(cgh.get(0));//to get the particular index value 

	System.out.println(obj.size());// to know the size of the total no of elemENTS

	boolean a=obj.contains("hi");//to find whthr the eleemnt is available or not in that arraylist 
	System.out.println(a);
	boolean b=obj.contains("zzzz");
	System.out.println(b);
		}

	}
