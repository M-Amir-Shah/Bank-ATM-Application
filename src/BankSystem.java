import java.util.Scanner;
public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class BankAccount
{
	 int balance;
	 int previousTransaction;
	 String customerName;
	 String customerId;
	  BankAccount(String cname, String cid)
	  {
	  customerName = cname;
	  customerId = cid; 
      }

void deposit(int amount)
{
     if (amount !=0)
{
   balance = balance + amount;
  previousTransaction = amount;
}
}
 void withdraw(int amount)
{
   if (amount !=0)
{
   balance = balance - amount;
   previousTransaction = -amount;
}
}
 void getPrevioucTransaction() 
 { 
 int previoucTransaction = 0;
 
if(previoucTransaction > 0)
{
    System.out.println("Deposited: "+previousTransaction);
}

  else if (previoucTransaction < 0)
{
  System.out.println("Withdraw: "+Math.abs(previousTransaction));
}
 else
{
System.out.println("No Transaction Occured");
}
}
void showMenu()
{
 char option='\0';
Scanner scanner = new Scanner(System.in);
 System.out.println(" Wellcome "+customerName);
 System.out.println("Your ID is"+customerId);
 System.out.println("\n");
 System.out.println("A. Check Balance");
 System.out.println("B. Deposit");
 System.out.println("C. Withdraw");
 System.out.println("D. Previous Transaction");
 System.out.println("E. Exit");
 do
{ 
    System.out.println("==================================================");
    System.out.println("Enter an Option");
    System.out.println("==================================================");
    option = scanner.next().charAt(0);
    System.out.println("\n");
    switch(option)
{
 case 'A':
    System.out.println("--------------------------------------------------");
    System.out.println ("Balance=" +balance);
    System.out.println("--------------------------------------------------");
    System.out.println("\n");
    break;
    case 'B':
    System.out.println("--------------------------------------------------");
    System.out.println ("Enter an amount to deposit:");
    System.out.println("--------------------------------------------------");
    int amount = scanner.nextInt();
    deposit(amount);
    System.out.println("\n");
    break;
 case 'c':
    System.out.println("--------------------------------------------------");
    System.out.println ("Enter an amount to withdraw:");
    System.out.println("--------------------------------------------------");
    int amount2 = scanner.nextInt();
    withdraw(amount2);
    System.out.println("\n");
    break;
 case 'D':
    System.out.println("--------------------------------------------------");
    getPrevioucTransaction();
    System.out.println("--------------------------------------------------");
    System.out.println("\n");
    break;
 case 'E':
    System.out.println("**************************************************");
    break;
    default:
    System.out.println(" Invalid Option!!. Please Enter Again");
  break;
}
}
  while(option != 'E');
   System.out.println("ThankYou for Using our Services");
}  
}