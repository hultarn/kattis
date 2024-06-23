// https://open.kattis.com/problems/thanosthehero

#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>
#include <stdio.h>

int main()
{
	unsigned short int N;
	scanf("%hu", &N);
	long int a[N];
	long long dead = 0;

	for (int i; i < N; i++)
	{
		scanf("%li", &a[i]);
	}

	for (int j = 0; j < N; j++)
	{
		if (a[j] < j)
		{
			printf("1");
			return 0;
		}
	}

	for (int i = 1; i < N; i++)
	{
		if (N - i > 0 && a[N - i - 1] >= a[N - i])
		{
			dead = dead + a[N - i - 1] - a[N - i] + 1;
			a[N - i - 1] = a[N - i] - 1;
		}
	}

	printf("%lli", dead);
	return 0;
}