package WPO1;

public class UnrestrictedBank {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public UnrestrictedBank(String aN, String aH, double b) {
        this.accountNumber = aN;
        this.accountHolder = aH;
        this.balance = b;
    }


    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public static void main(String[] args){

    }
}
