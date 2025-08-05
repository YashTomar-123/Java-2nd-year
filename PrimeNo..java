package Fundamentals;
import java.util.Scanner;
//Prime no.
public class PrimeNo {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n  = Sc.nextInt();
		if(n>1) {
			int i = 1;
			int counter = 0;
			while(i<=n) {
				if(n%i==0) {
					counter++;
				}
				i++;
			}
			if(counter>2) {
				System.out.println("Not a Prime No.");
			}
			else {
				System.out.println("Prime No.");
			}
		}
		else {
			System.out.println("Not a Prime No.");
		}
	}
}