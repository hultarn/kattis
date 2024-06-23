// https://open.kattis.com/problems/toilet

package solutions;

import java.util.Scanner;

public class ToiletSeat 
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		char[] cA = sc.nextLine().toCharArray();
		int pol1 = 0, pol2 = 0, pol3 = 0;
		
		if((cA[0] == 'D' && cA[1] == 'D') || (cA[0] == 'D' && cA[1] == 'U'))
			pol1++;

		if(cA[0] == 'U' && cA[1] == 'D')
			pol1 += 2;
		
		for(int i = 2; i < cA.length; i++)
			if(cA[i] == 'D')
				pol1 += 2;
				
		//------------------------------------------------------------------------
		
		if((cA[0] == 'U' && cA[1] == 'U') || (cA[0] == 'U' && cA[1] == 'D'))
			pol2++;			

		if(cA[0] == 'D' && cA[1] == 'U')
			pol2 += 2;
		
		for(int i = 2; i < cA.length; i++)
			if(cA[i] == 'U')
				pol2 += 2;

		//------------------------------------------------------------------------
		
		for(int i = 0; i < cA.length-1; i++)
			if(cA[i] != cA[i+1])
				pol3 += 1;
			
		System.out.println(pol1 + "\n" +pol2 + "\n" + pol3);
		sc.close();
	}
}