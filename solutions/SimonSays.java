// https://open.kattis.com/problems/simon

package solutions;

import java.util.Scanner;

public class SimonSays 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String s, s2;
		
		while(T-- > 0)
		{			
			s = sc.nextLine();			
			s2 = s.replaceAll("simon says ", "");
			
			System.out.println(s2.length() < s.length() ? s2 : "");
		}

		sc.close();
	}
}
