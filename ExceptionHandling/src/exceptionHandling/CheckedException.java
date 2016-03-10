package exceptionHandling;

/*
 * we can extend any checked exception to make 
 * this class as checked exception class
 * */
public class CheckedException extends Exception{ 

	public CheckedException(String message){
		super(message);
	}
}
