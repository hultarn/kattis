// https://open.kattis.com/problems/nastyhacks

package solutions;

import java.util.Scanner;

public class NastyHacks 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0)
		{
			int r = sc.nextInt(), e = sc.nextInt(), c = sc.nextInt();
			System.out.println(r >= e - c ? r > e - c ? "do not advertise" : "does not matter" : "advertise");
		}
		sc.close();
	}
}
