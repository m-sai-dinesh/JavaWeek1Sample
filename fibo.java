import java.util.*;
public class fibo {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter maximum number to print : ");
		int n = inp.nextInt();
		int a=0,b=1;
		int c = a + b ;
		System.out.print(a+" "+b+" ");
		while(c<=n)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
}
