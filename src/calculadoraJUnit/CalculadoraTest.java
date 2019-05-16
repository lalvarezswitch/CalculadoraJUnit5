package calculadoraJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static java.time.Duration.ofMillis;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	static Calculadora calc;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		//calc = new Calculadora();
		calc.clear();
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		//calc.clear();
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Test
	public void testSum() {
		//Calculadora calc = new Calculadora();
		System.out.println("sum()");
		int result  =  calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}
	
	@Test
	public void testAnsSum() {
		//Calculadora calc = new Calculadora();
		System.out.println("ansSum()");
		calc.add(3, 2);
		int result  =  calc.ans();
		int esper = 5;
		assertEquals(esper, result);
	}
	
	@Test
	public void testDiv() {
		System.out.println("div()");
		calc.div(5, 2);		
	}
	
	@Test 
	public void testDivPorCero() {
		System.out.println("divPorCero()");
		//calc.div(5, 0);
		assertThrows(ArithmeticException.class, ()-> { 
			calc.div(5, 0);
		}, "ArithmeticException esperada");
	}
	
	@Test
	public void testAlgoritmoOptimo() {
		System.out.println("algoritmoOptimo()");		
		assertTimeout(ofMillis(1500),() -> {
			calc.operacionOptima();
		},"TimeoutException esperada");
	}
	
	
	/*@Test
	public void testSuma() {
		int resultado = Calculadora.suma(2, 3);
		int esperado = 5; //2 + 3 = 5
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(3, 2);
		int esperado = 1; //3 - 2 = 1
		assertEquals(esperado, resultado);
	}*/

}
