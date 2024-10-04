package epeaci4;

//class for account
//should contain and handle amount, interest rate, account number
//and type of account (savings)
public class Account {
    //1. Klassvariabler
    //2. Instansvariabler
    //3. Konstruktorer
    //4. Metoder
    private double amount;
    private double interestRate;
    private String accountNumber;
    private String accountType;
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

}
