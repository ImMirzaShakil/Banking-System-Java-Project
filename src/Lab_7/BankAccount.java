package Lab_7;
public class BankAccount {
    String memberName, accountNumber;
    double accountBalance, minimumBalance;
    
    BankAccount(String n, String an, double ab){
        memberName = n;
        accountNumber = an;
        accountBalance = ab;
    }
    
    void deposit(double amt)
    {
        accountBalance += amt;
    }
    
    void withdraw(double amt){
        if(accountBalance > amt)
        {
            accountBalance -= amt;
        }
    }
    
    double getBalance(){
        return accountBalance;
    }
    
    
}
