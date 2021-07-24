"""
===========================
what the problem?       |||
===========================

===========================
what the expected result? |
===========================


========================================
how many step for solving this problem?|
========================================


=====================================
how many ways to solve this problem?|
=====================================

===========================
how long it takes?       ||
===========================
"""


// CPP program to find the Nth term
// of Fibonacci series
#include <bits/stdc++.h>
using namespace std;
int term[1000];
// Fibonacci Series using memoized Recursion
int fib(int n)
{
	// base case
	if (n <= 1)
		return n;

	// if fib(n) has already been computed
	// we do not do further recursive calls
	// and hence reduce the number of repeated
	// work
	if (term[n] != 0)
		return term[n];

	else {

		// store the computed value of fib(n)
		// in an array term at index n to
		// so that it does not needs to be
		// precomputed again
		term[n] = fib(n - 1) + fib(n - 2);

		return term[n];
	}
}

// Driver Code
int main()
{
	int n = 6;
	printf("%d", fib(n));
	return 0;
}
