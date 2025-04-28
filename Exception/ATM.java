public class ATM {
    private double money;
    private int pin;

    public ATM(double initialMoney, int pin) {
        this.money = initialMoney;
        this.pin = pin;
    }

    public void withdraw(double amount, int enteredPin) throws InvalidMoneyException, IncorrectPinException {
        if (enteredPin != this.pin) {
            throw new IncorrectPinException("Incorrect PIN entered.");
        }

        if (amount <= 0) {
            throw new InvalidMoneyException("Withdrawal amount must be positive.");
        }

        if (money < amount) {
            throw new InvalidMoneyException("Insufficient funds.");
        }

        money -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + money);
    }

    public double getBalance() {
        return money;
    }


    public static class InvalidMoneyException extends Exception {
        public InvalidMoneyException(String message) {
            super(message);
        }
    }

   
    public static class IncorrectPinException extends Exception {
        public IncorrectPinException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000.0, 1234); 
        try {
            atm.withdraw(500.0, 1234);
            atm.withdraw(600.0, 1234); 
        } catch (InvalidMoneyException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IncorrectPinException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            atm.withdraw(100, 4321); 
        }
        catch(InvalidMoneyException e){
            System.err.println("Error: " + e.getMessage());

        }
        catch(IncorrectPinException e){
            System.err.println("Error: " + e.getMessage());

        }
        try{
            atm.withdraw(-100, 1234); 
        }
        catch(InvalidMoneyException e){
            System.err.println("Error: " + e.getMessage());

        }
        catch(IncorrectPinException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}