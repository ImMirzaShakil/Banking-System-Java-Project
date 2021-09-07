package Lab_7;
public class StudentAccount extends BankAccount{
    String institutionName;
    public StudentAccount(String name, String acnum, double b, String institute) {
        super(name, acnum, b);
        institutionName = institute;
    }
}
