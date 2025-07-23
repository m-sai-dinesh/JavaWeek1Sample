import java.util.*;
public class multab {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter max table to print : ");
		int n = inp.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.print("\n");
		}
	}
}
