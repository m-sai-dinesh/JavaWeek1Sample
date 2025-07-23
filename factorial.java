import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = inp.nextInt();
		long  x=1;
		int y = n;
		while(y!=1)
		{
			x=x*y;
			y=y-1;
		}
		System.out.print("Factorial of  "+n+" is : "+x);
		
	}

}
