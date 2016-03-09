package org.com;

public class MainApp {

	public static void main(String[] args) {
	
		 try {
		        Class cls = Class.forName("org.com.Team");

		        System.out.println("Class = " + cls.getName());
		        
		        System.out.println("New statement added");
		     }
		     catch(ClassNotFoundException ex) {
		        System.out.println(ex.toString());
		     }
	}
	
}


class Team{
	
	
	public void team() throws ClassNotFoundException{
		Class.forName("normal class");
		System.out.println("normal method");
	}
	
}