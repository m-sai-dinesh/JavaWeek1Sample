import java.util.*;
public class gcdndlcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = inp.nextInt();
        System.out.print("Enter second number : ");
        int b = inp.nextInt();
        int x = gcd(a, b);
        int y = lcm(a, b);
        System.out.println("GCD of " + a + " and " + b + " is : " + x);
        System.out.println("LCM of " + a + " and " + b + " is : " + y);
    }
}
