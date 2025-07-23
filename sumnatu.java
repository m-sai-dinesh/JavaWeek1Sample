import java.util.*;
public class sumnatu {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter how many natural numbers to add : ");
		int n = inp.nextInt();
		System.out.print("Sum of "+n+" natural numbers is : "+(n*(n+1))/2);
	}
}
