package Entornos;


public class Principal {

	public static void main(String[] args) {

		int numeros[] = new int[3];
		boolean nrepetido = false;
		int random = 0;
		
		do {
			nrepetido = false;
			for (int i = 0; i < numeros.length; i++) {
				random = (int)(Math.random() * 9)+2;
				numeros[i] = random;
			}

			if (numeros[0] == numeros[1] || numeros[0] == numeros[2]|| numeros[1] == numeros[2]) {
				nrepetido = true;
			}
			
		} while (nrepetido);

		int resultadoFibonacci[] = new int[3];
		int resultadoFactorial[] = new int[3];
		boolean resultadoPrimo[] = new boolean[3];

		resultadoFibonacci[0]=Algoritmos.fibonacci(numeros[0]);
		resultadoFibonacci[1]=Algoritmos.fibonacci(numeros[1]);
		resultadoFibonacci[2]=Algoritmos.fibonacci(numeros[2]);
		
		resultadoFactorial[0]=Algoritmos.factorial(numeros[0]);
		resultadoFactorial[1]=Algoritmos.factorial(numeros[1]);
		resultadoFactorial[2]=Algoritmos.factorial(numeros[2]);
		
		resultadoPrimo[0]=Algoritmos.primo(numeros[0]);
		resultadoPrimo[1]=Algoritmos.primo(numeros[1]);
		resultadoPrimo[2]=Algoritmos.primo(numeros[2]);
		
		System.out.println("Terminado!");
		
	}

}
