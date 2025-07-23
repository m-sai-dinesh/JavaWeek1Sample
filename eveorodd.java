import java.util.*;
public class eveorodd {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = inp.nextInt();
		if(n%2==0)
			System.out.print(n+" is even");
		else
			System.out.print(n+" is odd");
	}

}
