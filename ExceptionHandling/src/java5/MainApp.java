package java5;

import java.util.ArrayList;
import java.util.LinkedList;
import static java.lang.System.out;

public class MainApp extends Parent{

	public static void main(String[] args) {
		//feature 1: Generics
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello1");
		list.add("Hello2");
		System.out.println("Values in list are: " + list);
		
		//feature 2: Boxing and unboxing
		
		int i = 10;
		Integer i1 = i; // Boxing
		Integer i2 = new Integer(i); //Boxing
		
		System.out.println("Values of Integer I1 and I2 are: "+i1 + " " + i2);
		
		int i3 = i2; // unboxing
		
		System.out.println("Value of i3 is: " + i3);
		
		
		//feature 3: Enhanced for loop/foreach loop
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("value4");
		list1.add("value1");
		list1.add("value3");
		list1.add("value2");
		
		for(String str : list1){
			System.out.println(str);
		}
		
		//feature 4: varargs
		varagrsTesting(10,"val1","val2","val3","val4");
		
		//feature 5: static imports
		
		out.println("static import example");
		
		//feature 6: annotations
		new MainApp().pMethod();
	}

	public static void varagrsTesting(int a, String... str){
		System.out.println("value of int a is: " + a);
		for(String str1 : str){
			System.out.println(str1);
		}
	}
	@Override
	public void pMethod(){
		System.out.println("overridden method in child class");
	}
}

class Parent{
	public void pMethod(){
		System.out.println("method in parent");
	}
}