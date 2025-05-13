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





	}

}
