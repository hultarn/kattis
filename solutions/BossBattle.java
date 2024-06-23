// https://open.kattis.com/problems/bossbattle

package solutions;

import kattio.Kattio;

public class BossBattle 
{
	public static void main(String[] args) 
	{
		Kattio io = new Kattio(System.in, System.out);
		int p = io.getInt();
		io.println( p > 3 ? p - 2 : "1");
		io.close();	
	}
}
