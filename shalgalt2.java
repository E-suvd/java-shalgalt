package suvd;

import java.util.Scanner;

public class shalgalt2 {
	static int urjwer(int n1, int n2) {
		if (n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		if (n1 == n2) {
			return n1;
		}
		else {
			return n2 * urjwer(n1, n2-1);
		}
	}

	public static void main(String[] args) {
		// recursive
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number:");
		int n1 = s.nextInt();
		System.out.println("enter 2st number:");
		int n2 = s.nextInt();
		s.close();
		System.out.print(" Mult"+n1+"to" +n2+ "is" + urjwer(n1, n2));
		if (n1 < n2) {
			
			System.out.print("");
		}
		

	}

}
