package exceptionHandling;

public class MainApp {

	public static void main(String[] args) {
		//Checked Exception
		//It is mandatory to catch/throws the checked exception,
		//else it will give compile time exception
		
		try{
			throw new CheckedException("message in checked Exception");
		}catch(CheckedException e){
			System.out.println(e.getMessage());
		}
		
		//UncheckedExcetion
		//it is not mandatory to have try catch or throws statement
		//while throwing unchecked exception
		throw new UncheckedException("message in unchecked Exception");
		
	}

}
