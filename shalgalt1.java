package suvd;
import java.util.Scanner;
public class shalgalt1 {
	static void outStr(String str) {
		System.out.println(str);
		return;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ta ugee oruulna uu:");
		String str = scan.nextLine();
		char arrName[] = new char[str.length()];

		for(int i=0; i<str.length(); i++) {
			arrName[i]=str.charAt(i);
		}
		for(int i=arrName.length-1; i<arrName.length; i--) {
			System.out.print(arrName[i]);
		}
		scan.close();
	}
	
}
