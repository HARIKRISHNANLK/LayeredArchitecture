package app.exeption;

public class InvalidAgeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidAgeException()
	{
		
	}
	public InvalidAgeException(String message)
	{
		super(message);
	}
}