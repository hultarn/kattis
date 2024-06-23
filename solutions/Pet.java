// https://open.kattis.com/problems/pet

package solutions;

import java.util.Scanner;

public class Pet 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int max = 0, r = 0, score = 0;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 4; j++)
				score += sc.nextInt();
			
			if(score > max)
			{
				max = score;
				r = i;
			}
			score = 0;
		}
		System.out.println(r + 1 + " " + max);
		sc.close();
	}
}