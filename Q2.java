import java.util.*;
class Bank{
	String name;
	long acc_no;
	int amt=0;
	void deposit(int amount){
		amt+=amount;
	}
	void withdraw(int amount){
		amt-=amount;
	}
	void checkBalance(){
		System.out.println("Current Balance: "+amt);
	}
	void insert(String n,long  acc_n,int a){
		name=n;
		acc_no=acc_n;
		amt=a;
	}
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Account number : "+acc_no);
		System.out.println("Current Balance : "+amt);
	}
}
class run{
	public static void main(String args[])
	{
		System.out.println("Menu \n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Insert \n 5.display \n 6.Exit");
		Scanner sc=new Scanner(System.in);
		int c;
		Bank p1=new Bank();
		while(true)
		{
			c=sc.nextInt();
			switch(c)
			{
				case 1:int am;
					am=sc.nextInt();
					p1.deposit(am);
					break;
				case 2:int amt;
					amt=sc.nextInt();
					p1.withdraw(amt);
					break;
				case 3:p1.checkBalance();
					break;
				case 4:sc.nextLine();
					String name=sc.nextLine();
					long acc_n=sc.nextLong();
					int a=sc.nextInt();
					p1.insert(name,acc_n,a);
					break;
				case 5:p1.display();
					break;
				case 6:System.exit(0);
			}
		}	
	}
}	