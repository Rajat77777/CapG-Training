package variables;

public class Passport {
	 private String passport_number;
	 public Passport(String passport_number) {
		 setPassport_number(passport_number);
	 }
	 public String getPassport_number() {
		 return passport_number;
	 }
	 public void setPassport_number(String passport) {
		 this.passport_number=passport;
	 }

}
