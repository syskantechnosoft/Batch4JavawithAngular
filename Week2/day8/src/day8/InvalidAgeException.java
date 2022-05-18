package day8;

//Custom checked exception
public class InvalidAgeException extends RuntimeException {
 
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "InvalidAge To open Bank Account!!! Try minor accounts";
	}
	
}
