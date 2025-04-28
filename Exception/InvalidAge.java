package Exception;

public class InvalidAge extends RunTimeException {
	
	private static  String message="Age is Invalid";
	InvalidAge(){
		super(message);
	}
	
	public InvalidAge(String message) {
	
		super(message);
	}
	}

}
