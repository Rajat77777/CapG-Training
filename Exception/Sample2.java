package Exception;

public class Sample2 {
	public static int ReturnMetho() {
		try {
			return 1;
			
		}catch(Exception e) {
			return 2;
		}finally {
		return 3;	
		}
		
	}
	public static void main(String[] args) {
		System.out.println(ReturnMetho());
	}

}
