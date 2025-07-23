import java.util.*;
public class Account {
	Scanner inp = new Scanner(System.in);
	private double balance = 400.00;
	public double	getBal(int id)
	{
		System.out.print("Enter amount to add to account no  "+id+" : ");
		int amount = inp.nextInt();
		balance+=amount;
		return balance;
	}
	public static void main(String[] args) {
		Account Acc = new Account();
		double val = Acc.getBal(1);
		System.out.print("The balance of 1st account is : "+val+"");
		double val1 = Acc.getBal(2);
		System.out.print("The balance of 2nd account is : "+val1);
	}

}
