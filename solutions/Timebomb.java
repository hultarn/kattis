// https://open.kattis.com/problems/timebomb

package solutions;

import java.util.Scanner;

public class Timebomb 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	
		String[] a = {"**** ** ** ****", "  *  *  *  *  *", "***  *****  ***", "***  ****  ****", "* ** ****  *  *",
				 "****  ***  ****", "****  **** ****", "***  *  *  *  *","**** ***** ****","**** ****  ****"};
		StringBuilder number = new StringBuilder();	
		StringBuilder tmp = new StringBuilder();	
		String s = "";
		
		for(int i = 0; i < 5; i++)
			sb.append(sc.nextLine() + " ");
		
		for(int i = 0; i < sb.length() / 20; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				int c = sb.length() / 20;
				tmp.append(sb.substring(c * 4 * j + i * 4, j * c * 4 + 3 + i * 4));
			}
			s = tmp.toString();
			
			for(int j = 0; j < 10; j++)
				if(a[j].equals(s))
					number.append(""+j);
			
			tmp.setLength(0);
		}
				
		System.out.println(Integer.parseInt(number.toString()) % 6 == 0 ? "BEER!!" : "BOOM!!");		
		sc.close();
	}
}
