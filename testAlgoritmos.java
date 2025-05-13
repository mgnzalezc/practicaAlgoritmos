package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testAlgoritmos {

	static Algoritmos alg;

	@BeforeAll
	static void setUp() {
		alg = new Algoritmos() {};
	}

	@Test
	void testExceptionFibonacci() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {alg.fibonacci(-1);} );
		String mensajeEsperado = "El numero tiene que ser mayor a 0";
		String mensajeObtenido = e.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	@Test
	void testExceptionFactorial() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {alg.factorial(-1);} );
		String mensajeEsperado = "El numero tiene que ser mayor a 0";
		String mensajeObtenido = e.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	@Test
	void testExceptionPrimo() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {alg.primo(-1);} );
		String mensajeEsperado = "El numero tiene que ser mayor a 2";
		String mensajeObtenido = e.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	@Test
	void testFibonacci() {
		assertEquals(55, alg.fibonacci(10));
		assertEquals(21, alg.fibonacci(8));
		assertEquals(3, alg.fibonacci(4));
	}

	@Test
	void testFactorial() {
		assertEquals(3628800, alg.factorial(10));
		assertEquals(40320, alg.factorial(8));
		assertEquals(24, alg.factorial(4));
	}

	@Test
	void testPrimo() {
		assertEquals(false, alg.primo(10));
		assertEquals(false, alg.primo(8));
		assertEquals(false, alg.primo(4));
	}

}
