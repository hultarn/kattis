// https://open.kattis.com/problems/compromise

package solutions;

import java.util.Scanner;

public class BestCompromise 
{
	public static void main(String[] args)
	{  		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), m, n;
		int[] votes;
		char[] curr;
		
		while(t-- > 0)
		{	
			m = sc.nextInt(); n = sc.nextInt();
			votes = new int[n]; curr = new char[n];
			sc.nextLine();
			
			while(m-- > 0)
			{	
				curr = sc.nextLine().toCharArray();
				
				for(int i = 0; i < n; i++)
					votes[i] = curr[i] == '1' ? votes[i] + 1 : votes[i] - 1;
			}
			
			for(int i : votes)
				System.out.print(i < 0 ? 0 : 1);
			System.out.println();
		}
		
		sc.close();
	}
}
