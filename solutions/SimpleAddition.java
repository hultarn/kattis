// https://open.kattis.com/problems/simpleaddition

package solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		sc.close();

		System.out.println(a.add(b));
	}
}
