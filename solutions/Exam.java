// https://open.kattis.com/problems/exam

package solutions;

import java.util.Scanner;

public class Exam 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rights = sc.nextInt();
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		int c = 0;
		
		for(int i = 0; i < a.length; i++)
			 if(a[i] == b[i])
				 c++;
		
		System.out.println(b.length - Math.abs(c - rights));
		sc.close();
	}
}
