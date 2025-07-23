import java.util.*;
public class lpyr {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter year to check : ");
		int year = inp.nextInt();
		if(year%100 == 0 && year %4==0)
			System.out.print(year+" is leap year");
		else if(year%100!=0 && year%4==0)
			System.out.print(year+" is leap year");
		else
			System.out.print(year+" is not leap year");
	}

}
