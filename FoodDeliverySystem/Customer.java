package FoodDeliverySystem;

public class Customer {
	private String userName;
	private boolean loggedIn;
	
	public Customer(String userName,boolean loggedIn) {
		this.setUserName(userName);
		this.setLoggedIn(loggedIn);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public void login() {
		this.loggedIn=true;
	}
	
	
	}


