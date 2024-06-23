// https://open.kattis.com/contests/zk8yum/problems/aboveaverage

package solutions;

import java.util.Scanner;

public class AboveAverage
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int nrTests =  sc.nextInt();
		
		for(int i = 0; i < nrTests; i++)
		{
			int[] a = new int[sc.nextInt()];
			double avg = 0;
			double count = 0;
			
			for(int j = 0; j < a.length; j++)
			{
				a[j] = sc.nextInt();
				avg += a[j];
			}
			
			for(int num : a)
				if(num > avg/a.length)
					count++;
			
			String s = "" + Math.round((count/a.length)*100000.0) / 1000.0;
			
			System.out.println((s.substring(s.indexOf("."), s.length()).length() < 4 ? 
					s.substring(s.indexOf("."), s.length()).length() < 3 ? s + "00" : s + "0" : s)+"%");
		}
		
		sc.close();	
	}
}
