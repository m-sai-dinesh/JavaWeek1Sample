import java.util.*;
public class root {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);	
		System.out.print("Enter the co-effecient of x^2 : ");
		int a = inp.nextInt();
		System.out.print("Enter the co-effecient of x : ");
		int b = inp.nextInt();
		System.out.print("Enter the constant term : ");
		int c = inp.nextInt();
		int D = b*b-4*a*c;
		if(D<0)
			System.out.print("No real roots,roots are imaginary");
		else if(D==0)
		{
			float r = -(b)/(2*a);
			System.out.print("Equal real root is : "+r);
		}
		else
		{
			float r1 = (-b+(float)Math.sqrt(D))/(2*a);
			float r2 = (-b-(float)Math.sqrt(D))/(2*a);
			System.out.print("Roots are real and distinct  : "+"Root1 : "+r1+" Root2 : "+r2);

		}
}
}
