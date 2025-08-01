package Fundamentals;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int cpy = n;
		int id = 0;
		while(n > 0) {
			int i;
			i = n%10;
			id = 10 * id + i;
			n=n/10;
		}
		n = cpy;
		if(id == n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
