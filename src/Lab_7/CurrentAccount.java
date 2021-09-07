package Lab_7;
public class CurrentAccount extends BankAccount{
    int tradeLicenseNumber;
    public CurrentAccount(String n, String an, double ab, int t) {
        super(n, an, ab);
        tradeLicenseNumber = t;
    }
    
}
