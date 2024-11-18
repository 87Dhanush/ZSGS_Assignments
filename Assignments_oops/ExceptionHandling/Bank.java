import java.util.*;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class Bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AccountHolder obj=new AccountHolder("Dhanushraj", 101, 1000);
        boolean status=true;
        do { 
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Enter your choice \n1)Balance check\n2) deposit\n3)Withdraw\n4)exit");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Enter any one valid choice : ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is rs "+ obj.getBalance());
                    break;
                case 2:
                    System.out.print("Enter a deposit amount : ");
                    int amount=sc.nextInt()+obj.getBalance();
                    sc.nextLine();
                    obj.setBalance(amount);
                    System.out.println("Amount credited Successfully Your current balance is (rs) :"+obj.getBalance());
                    break;
                case 3:
                    System.out.println("Enter a anount you withdraw");
                    int withdrawAmount=sc.nextInt();
                    
                    if(withdrawAmount>obj.getBalance()){
                        try{
                          throw new InsufficientBalanceException("Insufficient Balance");
                        }
                        catch( InsufficientBalanceException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    else{
                       System.out.println("Amount "+withdrawAmount+"depited from your acoount");
                       obj.setBalance(obj.getBalance()-withdrawAmount);
                       System.out.println("Current Balance : "+obj.getBalance());
                    }
                    break;
                case 4:
                   status=false;
                   System.out.println("logged out.....");
                   break;
                default:
                    System.out.println("Enter valid choice");
            }
            
        } while (status);


    }
}
class AccountHolder{
    private String name;
    private int accountNumber;
    private int balance;

    public AccountHolder(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}