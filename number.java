import java.util.*;
public class number {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = inp.nextInt();
		if(n>0)
		{
			System.out.print("The number "+n+" is positive");
		}
		else if(n==0)
		{
			System.out.print("The number "+n+" is equal to zero");
		}
		else
		{
			System.out.print("The number "+n+" is negative");
		}
	}
}
