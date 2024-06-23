// https://open.kattis.com/problems/iwannabe

package solutions;

import java.util.Scanner;

public class IWannaBeTheVeryBest 
{
	long atk = 0, def = 0, hp = 0;
	static int size = 0;
	
	public IWannaBeTheVeryBest(long atk, long def, long hp) 
	{	
		this.atk = atk; this.def = def; this.hp = hp;
		size++;
	}

	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), r1 = 0, r2 = 0, r3 = 0, count = 0;
		long aMax = 0, dMax = 0, hMax = 0;
		
		var pList = new IWannaBeTheVeryBest[N];
		
		while(N-- > 0)			
			pList[size] = new IWannaBeTheVeryBest(sc.nextLong(), sc.nextLong(), sc.nextLong());

		while(K-- > 0)
		{
			for(int i = 0; i < size; i++)
			{
				if(pList[i].atk > aMax)
				{
					aMax = pList[i].atk;
					r1 = i;
				}
				if(pList[i].def > dMax)
				{
					dMax = pList[i].def;
					r2 = i;
				}
				if(pList[i].hp > hMax)
				{
					hMax = pList[i].hp;
					r3 = i;
				}
			}
			
			pList[r1].atk = -1; pList[r2].def = -1; pList[r3].hp = -1;			
			aMax = 0; dMax = 0; hMax = 0;			
		}
		
		for(IWannaBeTheVeryBest o : pList)
			if(o.atk == -1 || o.def == -1 || o.hp == -1)
				count++;
		
		System.out.println(count);		
		sc.close();
	}
}
