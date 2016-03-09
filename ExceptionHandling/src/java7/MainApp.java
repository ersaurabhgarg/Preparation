package java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		//feature 1: Switch with string
		System.out.println(method1("b"));
		
		//feature 2: int with underscore
		System.out.println(100_12_45__89);
		
		//feature 3: diamond operator
		Set<String> set = new HashSet<>();//no need to mention generic type on right side
		set.add("value1");
		set.add("value2");
		System.out.println(set);
		
		//feature 4: Multiple exceptions catch in single catch block
		
			try {
				FileOutputStream fout = new FileOutputStream("test.txt");
				
				fout.write(100);
				fout.close();
			} catch(IOException | ArrayIndexOutOfBoundsException e){
				System.out.println("In Exception");
			}/* catch (FileNotFoundException | IOException e) { // this will give compile time exception as 
				e.printStackTrace();                            // both the exceptions can be caught by IOException
			}*/													// so we need to take care of hierarchy	
			
		//feature 5: Try with resources
			
			try(FileOutputStream fout = new FileOutputStream("test1.txt")){
				fout.write(101);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//no need to add code to close InputStream
				//it's close method will be internally called
			}
			
		// feature 6: Binary Literals
			
			int i=0b0111;
	        byte b=(byte) 0b0111;
	        long l=(long) 0B0111L;
	        System.out.println("i="+i);
	        System.out.println("b="+b);
	        System.out.println("l="+l);
			
	}
// switch with string
	public static String method1(String val){
		String value = null;
		switch(val){
		case "a": System.out.println("in a"); 
		  value = "a";
		  break;
		case "b": System.out.println("in b"); 
		  value = "b";
		  break;
		case "c": System.out.println("in c"); 
		  value = "c";
		  break;
		case "d": System.out.println("in d"); 
		  value = "d";
		  break;
		default:System.out.println("No record found");
		  break;
		}
		return value;
	}
}
