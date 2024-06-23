// https://open.kattis.com/problems/hissingmicrophone

package solutions;

import java.util.Scanner;

public class HissingMicrophone 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		String s = sc.next();		
		System.out.print(s.length() > (s.replace("ss", "")).length() ? "hiss" : "no hiss");
		sc.close();
	}
}
