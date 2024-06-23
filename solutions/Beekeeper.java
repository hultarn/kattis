// https://open.kattis.com/problems/beekeeper

package solutions;

import java.util.Scanner;

public class Beekeeper 
{
	static String[] list = {"aa", "ee", "ii", "oo", "uu", "yy"};
	public static void main(String[] args)
	{  
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		while(true)
		{
			int N = scanner.nextInt();
			String w = "";
			String w_original = "";
			String max = "";
			int prevMax = -1;
			
			if(N == 0)
				break;
			
			for(int i = 0; i < N; i++)
			{
				w = scanner.next();				
				w_original = w;

				for (String v : list) {
					w = w.replace(v, "");
				}

				int occ = (w_original.length() - w.length()) / 2;			
				if(occ > prevMax)
				{
					prevMax = occ;
					max = w_original;
				}
			}
			System.out.println(max);

			if(count++ == 10)
				break;
		}
		
		scanner.close();
	}
}
