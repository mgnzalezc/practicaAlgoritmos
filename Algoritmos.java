package Entornos;

public abstract class Algoritmos {

	public static int fibonacci(int n) {

		if(n<0) {
			throw new IllegalArgumentException("Numero menor a 0"); 
		}

		int f0 = 0;
		int f1 = 1;
		int f = 0;

		for (int i = 0; i < n-1; i++) {
			f = f1 + f0;
			f0 = f1;
			f1 = f;
		}

		return f;
	}


	public static int factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Numero menor a 0"); 
		}

		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans*=i;
		}
		return ans;
	}


	public static boolean primo(int n) {
		if (n<2){
			throw new IllegalArgumentException("Numero menor a 2"); 
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
