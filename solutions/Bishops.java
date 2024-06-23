// https://open.kattis.com/problems/bishops

package solutions;

import java.util.Scanner;

public class Bishops 
{
	public static void main(String[] args)
	{  		
		Scanner sc = new Scanner(System.in);
		int N;
		
		while(sc.hasNext())
		{
			N = sc.nextInt();		
			System.out.println(N > 1 ? N + N - 2 : "1"); 
		}
		
		sc.close();
	}
}
