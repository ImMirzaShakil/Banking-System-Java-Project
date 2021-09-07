package Lab_7;
public class SavingAccount extends BankAccount{
    double interest = 0.05;
    int maxwithlimit = 1215;
    
    public SavingAccount(String n, String an, double ab, double mn) {
        super(n, an, ab);
        minimumBalance = mn;
    }
 
    double getNetBalance(){
        double n = accountBalance * interest;
        double m = accountBalance + n;
        return m;
    }
    
    @Override
    void withdraw(double amt){
        if(amt <= maxwithlimit){
            if(accountBalance > 2000)
            {
                super.withdraw(amt);
            }
        }
    }
    
    
}
