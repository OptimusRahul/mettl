package com.GarbageCollection;

public class nthPrimeNum {

public static int nthPrime(int n) {
	int count =0;
	for(int i = 1; count<n; i++){
		System.out.println(i);
		if(isPrime(i)){
			count++;
		}
	}
	return count;		
}

public static boolean isPrime(int n){
	if(n < 2) return false;
	for(int i=2; i<n ;i++){
		if(n%i == 0)
			return false;
	}
	return true;
}

public static void main(String []args) {
	System.out.println(nthPrime(10));
}

}
