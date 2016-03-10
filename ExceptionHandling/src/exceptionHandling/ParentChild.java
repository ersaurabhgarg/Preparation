package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ParentChild {
	public void method1() throws UncheckedException{
		// if parent thrown unchecked exception
		// then it is not mandatory that overridden method needs 
		// to throw it(It may or may not throw the same unchecked exception or different one).
	}

	public void method2() throws CheckedException{
		// if parent thrown Checked exception
		// then it is not mandatory that overridden method needs 
		// to throw it(It may or may not throw the same checked exception).
	}

	public void method3(){

	}

	public void method4() throws CheckedException{

	}
	/* If parent is throwing any runtime exception which is either parent
	 * or child. There will not be any runtime or compile time exception.
	 *  */
	public void method5() throws ArithmeticException{

	}

	public void method6() throws RuntimeException{

	}

	public void method7() throws FileNotFoundException{

	}

	public void method8() throws IOException{

	}


}


class Child extends ParentChild{
	public void method1(){

	}

	public void method2(){

	}

	public void method3() throws UncheckedException{
		// if child thrown Unchecked exception
		// then it is not mandatory that parent class method needs 
		// to throw it(It may or may not throw the same/different unchecked exception).
	}

	public void method4() throws CheckedException{
		// if child thrown Checked exception
		// then it is mandatory that parent class method needs 
		// to throw the same exception.
	}

	public void method5() throws RuntimeException{

	}

	public void method6() throws ArithmeticException{

	}
// this method will not work
	/*public void method7() throws IOException{
		// if child thrown Checked exception which is parent of checked exception
		// thrown in parent class method
		// then it will give compile time exception
		// Parent must throw the same exception or the parent exception of 
		// checked exception thrown in child class overridden method
	}*/

	public void method8() throws FileNotFoundException{
		// vice versa is true. read statement of method7
	}
}