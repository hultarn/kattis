// https://open.kattis.com/problems/engineeringenglish

package solutions;

import java.util.HashMap;
import java.util.Scanner;

public class EngineeringEnglish 
{	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String s = "";
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNext())
		{
			s = sc.next().toLowerCase();
			
			if(map.get(s) == null)
			{
				map.put(s, 1);
				sb.append(s + " ");
			}
			else
				sb.append(". ");
		}
		System.out.print(sb);
		sc.close();
	}
}
