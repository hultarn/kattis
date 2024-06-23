// https://open.kattis.com/problems/isithalloween

package solutions;

import java.util.Scanner;

public class IsItHalloweenDotcom 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.print(s.equals("OCT 31") || s.equals("DEC 25") ? "yup" : "nope");
	}
}
