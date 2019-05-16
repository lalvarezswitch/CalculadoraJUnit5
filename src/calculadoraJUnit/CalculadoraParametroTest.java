package calculadoraJUnit;

import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;




class CalculadoraParametroTest {
	
	@ParameterizedTest
	@MethodSource("provider")
	public void testAdd(int a, int b, int exp) {
		Calculadora calc =  new Calculadora();
		int result = calc.add(a, b);
		assertEquals(exp, result);
	}
	
	private static Stream<Arguments> provider() {
		return Stream.of(
			Arguments.of(2,1,3),
			Arguments.of(3,1,4),
			Arguments.of(3,3,6),
			Arguments.of(2,3,5)
		);
	}

}
