// https://open.kattis.com/problems/thanos

#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>
#include <stdio.h>
#include <cstdlib>

int main()
{
	short int T;
	scanf("%hi", &T);

	long int P, R, F;
	signed char count = 0;

	while (T--)
	{
		scanf("%li", &P);
		scanf("%li", &R);
		scanf("%li", &F);

		while (P <= F)
		{
			P *= R;
			count++;
		}
		printf("\n%d\n", count);
		count = 0;
	}
	return 0;
}
