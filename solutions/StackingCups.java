// https://open.kattis.com/problems/cups

package solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StackingCups
{
	int r;	String c;

	static Scanner sc = new Scanner(System.in);
	
	StackingCups()
	{
		if(sc.hasNextInt())
		{
			r = sc.nextInt() / 2;
			c = sc.next();
		}
		else
		{
			c = sc.next();
			r = sc.nextInt();
		}
	}
	
	public static void main(String[] args) 
	{
		int rights = sc.nextInt();
		Collection<StackingCups> list = new ArrayList<StackingCups>();
		
		for(int i = 0; i < rights; i++)
			list.add(new StackingCups());
		
		Collections.sort((List<StackingCups>) list, (o1, o2) -> o1.r - o2.r);
		
		for(StackingCups o : list)
			System.out.println(o.c);	
	}
}
