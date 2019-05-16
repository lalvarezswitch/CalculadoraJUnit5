package calculadoraJUnit;

public class Calculadora {
	
	private int ans;
		
	public Calculadora() {
		ans = 0;
	}
	
	public int add(int a , int b) {
		ans = a + b;
		return ans;
	}
	
	public int sub(int a , int b) {
		ans = a - b;
		return ans;
	}
	
	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("No puedes dividir por cero!!!");
		}
		ans  = a / b;
		return ans;
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void clear() {
		ans = 0;
	}
	
	public void operacionOptima() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public static int suma(int a, int b) {
		return a + b;
	}
	
	public static int resta(int a, int b) {
		return a - b;
	}
	
	public static void main(String args[]) {
		int a = 3, b = 2;
		int res = suma(a, b);
		int esperado = 5;
		if (res == esperado) {
			System.out.println("Este programa está bien hecho.");
		} else {
			System.out.println("Este programa está mal hecho.");
		}
		//System.out.println("3 + 2 = " + res);
	}*/

}
