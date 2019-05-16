package calculadoraJUnit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({CalculadoraTest.class, CalculadoraParametroTest.class})
public class MiSuiteSuite {	

}
