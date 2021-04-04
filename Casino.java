import java.util.*;
import java.lang.*;
import java.util.Random;

class Casino
{
	public static void main(String args[])
	{	
	int c=0;
		while(c!=7)
		{	
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4.Reset");
		System.out.println("5.Work");
		System.out.println("6.Crime");
		System.out.println("7.Exit");
		Scanner t = new Scanner(System.in);		
		System.out.println("Enter your choice = ");
		int d = t.nextInt();
		c = d;
		account a = new account();
		switch(c)
		{
			case 1:
				a.deposit();
				break;
			case 2:
				a.withdraw();
				break;
			case 3:
				a.checkbalance();
				break;
			case 4:
				a.reset();
				break;
			case 5:
				a.work();
				break;
			case 6:
				a.crime();
				break;
			case 7:
				System.out.println("Thank you for playing the game");
				break;
			default: 
				System.out.println("Invalid choice");
				break;
		}
		System.out.println(" ");
		}
		
	}
}

class account
{
	static int balance=100;	
	void deposit()
	{
		System.out.println("Your current balance is="+balance);	
		Scanner t= new Scanner(System.in);
		System.out.println("Enter amount to be deposited=");
		int d= t.nextInt();
		balance= balance+d;
		System.out.println("Current Balance= "+balance);
	}
	
	
	void withdraw()
	{
		Scanner t= new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn = ");
		int w = t.nextInt();
		if(w>balance)
		{
		System.out.println("Insufficient balance");
		}
		else
		{
		balance = balance-w;
		System.out.println("Current Balance= "+balance);
		}
	}
	
	void checkbalance()
	{
		System.out.println("Balance in your account is = "+balance);
	}
	
	void reset()
	{
		balance= balance-balance+100;
		System.out.println("Your account has been reset");
	}
	
	void work()
	{
		Random rand = new Random();
		int res = rand.nextInt(1000);
		System.out.println("You have worked and earned = "+res+" Rupees"); 
		balance = balance +res;
	}
	
	void crime()
	{
		Random rand2 = new Random();
		int res2 = -300 + rand2.nextInt(1000);
		if (res2<0)
		{
		System.out.println("You have committed a crime and have been caught. Fine = "+res2+" Rupees"); 
		}
		else
		{
		System.out.println("You have committed a crime successfully and robbed = "+res2+" Rupees"); 
		}
		balance = balance + res2;
		if(balance<=-1000)
		{
			System.out.println("You have been bankrupted. Please reset your account");
			System.out.println("Press 4 to reset");
		}
	}
}


