package Lab_7;
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        Bank a = new Bank();
        while(true){
            System.out.println("Input ‘1’ to add a new Account");
            System.out.println("Input ‘2’ to deposit to an existing account");
            System.out.println("Input ‘3’ to withdraw from an account");
            System.out.println("Input ‘4’ to display the list of the accounts");
            System.out.println("Input ‘0’ to exit the system.");
            int n = w.nextInt();
            
            if(n == 1)
            {
                String nm;
                System.out.printf("Enter Name :: ");
                nm = w.next();
                System.out.println("Input '1' For Saving Account");
                System.out.println("Input '2' For Current Account");
                System.out.println("Input '3' For Student Accoutn");
                int m = w.nextInt();
                if(m == 1){
                    String an; double ab; double mn;
                    System.out.printf("Enter Account Number :: ");
                    an = w.next();
                    System.out.printf("Enter Account Balance :: ");
                    ab = w.nextDouble();
                    System.out.printf("Enter Account Minimum Balance :: ");
                    mn = w.nextDouble();
                    a.addAccount(nm, an, ab, mn);
                }
                else if(m == 2){
                    String an; double ab; int tl;
                    System.out.printf("Enter Account Number :: ");
                    an = w.nextLine();
                    System.out.printf("Enter Account Balance :: ");
                    ab = w.nextDouble();
                    System.out.println("Enter  TradeLicenseNumber :: ");
                    tl = w.nextInt();
                    a.addAccount(nm, an, ab, tl);
                }
                else if(m == 3){
                    String an; double ab; String ins;
                    System.out.printf("Enter Account Number :: ");
                    an = w.nextLine();
                    System.out.printf("Enter Account Balance :: ");
                    ab = w.nextDouble();
                    System.out.println("Enter  Institute Name :: ");
                    ins = w.nextLine();
                    a.addAccount(nm, an, ab, ins);
                }
            }
            
            else if(n == 2){
                String AcNumber; double amt;
                System.out.printf("Enter Account Number :: ");
                AcNumber = w.next();
                System.out.printf("Enter Amount :: ");
                amt = w.nextDouble();
                a.deposit(AcNumber, amt);
            }
            
            else if(n == 3){
                String AcNumber; double amt;
                System.out.printf("Enter Account Number :: ");
                AcNumber = w.next();
                System.out.printf("Enter Amount :: ");
                amt = w.nextDouble();
                a.withdraw(AcNumber, amt);
            }
            
            else if(n == 4){
                a.display();
            }
            else if(n == 0)
            {
                break;
            }
        }
    }
}
