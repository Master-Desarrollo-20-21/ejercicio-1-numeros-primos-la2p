package oo.ejercicios;

public class PrimeNumbers {

	public static void main(String[] args) {
		boolean resultIsPrime;
		int sumFirstPrime=0;
		int sumFiftyPrime = 0;
		int count = 1;
		int countPrime = 1;
		
		for(int i = 1; i<=50; i++) {
			resultIsPrime = isPrime(i);
			if(resultIsPrime) {
				System.out.println(i);
				sumFirstPrime = sumFirstPrime + i; 
			}
		}
		System.out.println("la suma de los números primos entre los primeros 50 números: " + sumFirstPrime);
		
		
		while(countPrime <= 50) {
			resultIsPrime = isPrime(count);
			if(resultIsPrime){
				sumFiftyPrime = sumFiftyPrime + count;
				countPrime++;
			}
			count++;
		}
		System.out.println("la suma de los primeros 50 números primos es: " + sumFiftyPrime);

	}
	
	public static boolean isPrime(int n) {
		if (n<2) {
			return false;
		}
		if(n == 2) {
			return true;
		}
		if(n%2==0) {
			return false;
		}else {
			for(int i = 3; i*i<=n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}