import java.util.*;
public class asci {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter charecter : ");
		char c = inp.next().charAt(0);
		System.out.print("ASCII value of "+c+" is : "+(int)c);
	}

}
