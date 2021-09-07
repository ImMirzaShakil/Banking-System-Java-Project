package Lab_7;
public class Bank {
    BankAccount[] account = new BankAccount[100];
    int i, j;
    void addAccount(String name, String balance, double minimumBal, double maxlimit)
    {
        for(i=0;i<10;i++)
        {
            if(account[i] == null)
                break;
        }
       account[i] = new SavingAccount(name, balance, minimumBal, maxlimit);
    }
    
    void addAccount(String nm,String an, double ab, int t){
        for(i=0;i<10;i++)
        {
            if(account[i] == null)
                break;
        }
        account[i] = new CurrentAccount(nm, an, ab, t);
    }
    
    void addAccount(String nm, String acnum, double b, String ins){
        for(i=0;i<10;i++)
        {
            if(account[i] == null)
                break;
        }
        account[i] = new StudentAccount(nm, acnum, b, ins);
    }
    
    BankAccount findAccount(String acnum)
    {
       int f = 0;
       for(i=0;i<10;i++)
       {
           if(account[i] == null)
           {
               f = 1;
               break;
           }
           if(acnum.equals(account[i].accountNumber))
           {
              f = 2;
              break;
           }
       }
       if(f == 1)
       {
           return null;
       }
       else
       {
           return account[i];
       }
    }
    
    void withdraw(String acnum, double amt)
    {
        int f = 0;
        for(i=0;i<10;i++)
        {
            if(account[i] == null)
            {
                f = 1;
                break;
            }
            if(acnum.equals(account[i].accountNumber))
            {
                if(account[i].accountBalance > amt)
                {
                    account[i].accountBalance = account[i].accountBalance - amt;
                    System.out.println("Successfully withdraw\n\n");
                }
                else
                {
                    System.out.println("Insufficient Balance\n\n");
                }
                break;
            }
        }
        if(f == 1)
         {
            System.out.println("Id not Found\n\n");
         }
    }
    
    void deposit(String acnum, double amt)
    {
        int f = 0;
        for(i=0;i<10;i++)
        {
            if(account[i] == null)
            {
                f = 1;
                break;
            }
            if(acnum.equals(account[i].accountNumber))
            {
                account[i].accountBalance = account[i].accountBalance + amt;
                System.out.println("Deposit Successfull\n\n");
                break;
            }
        }
        if(f == 1)
            System.out.println("Id not Found..");
    }
    
    void display()
      {
          for(i=0;i<10;i++)
          {
              if(account[i] == null)
              {
                  break;
              }
              else
              {
                  System.out.printf("Name :: %s\n", account[i].memberName);
                  System.out.printf("Account Number :: %s\n", account[i].accountNumber);
                  System.out.printf("Balance :: %f\n\n", account[i].accountBalance);
              }
          }
      }
}
