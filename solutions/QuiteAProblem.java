// https://open.kattis.com/problems/quiteaproblem

package solutions;

import java.util.Scanner;

public class QuiteAProblem
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext())
			System.out.println(sc.nextLine().toLowerCase().contains("problem") ? "yes" : "no");
		sc.close();
	}
}
