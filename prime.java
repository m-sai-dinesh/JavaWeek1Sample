import java.util.*;
public class prime {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = inp.nextInt();
		boolean f=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				f=false;
				break;
			}
		}
		if(f)
		{
			System.out.print(n+" is prime");
		}
		else
		{
			System.out.print(n+" is not-prime");
		}
	}

}
