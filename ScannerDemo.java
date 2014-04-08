import java.util.*;

class ScannerDemo{
	public static void main(String args[]){
	int age,pass,cash,choose,bal;
	String name;
	bal = 0;
	Scanner lemon = new Scanner(System.in);
	System.out.print("What is your name?: ");
	name = lemon.nextLine();
	System.out.println("What can i do for you "+name+"?");
	System.out.println("[1] Deposit");
	System.out.println("[2] Withdraw");
	System.out.println("[3] Check Balance");
	System.out.println();
	choose = lemon.nextInt();
	if (choose == 1){
		System.out.print("Input your desired amount to deposit: ");
		cash = lemon.nextInt();
		bal = bal+cash;
		System.out.println();
		System.out.println("Thanks! Your current balance is "+bal);}
	else 
	   
		{System.out.println("Not yet programmed!");
		}		
	}
	}		
	