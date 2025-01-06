package day3;

public class BankAccount {
    //Attributes
    private String accountHoldersName;
    private double currentBalance;

    //Constructor
    public BankAccount(String accountHoldersName, double currentBalance){
        this.accountHoldersName = accountHoldersName;
        this.currentBalance = currentBalance;
    }

    //Methods
    public void DepositMoney(double amount){
        currentBalance += amount;
    }
    public void WithdrawMoney(double amount){
        if(amount <= currentBalance){
            currentBalance -= amount;
        }
    }
    public String getBalance(){
        return "your name is: " + accountHoldersName + " current balance is: " + currentBalance;
    }

}
