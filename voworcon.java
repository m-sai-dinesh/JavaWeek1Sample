import java.util.*;
public class voworcon {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter charecter : ");
		char ch = inp.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					System.out.print("The charecter "+ch+" is vowel");
				}
		else
		{
			System.out.print("The charecter "+ch+" is consonant");
		}
	}

}
