import junit.framework.TestCase;


public class TocaLeerTest extends TestCase {

	public void testGenerarNumeroAleatorio() {
		int numA = -1;
		boolean[] check = new boolean[15];
		
		for (int i = 0; i < 1000; i++) {
			numA = TocaLeer.generarNumeroAleatorio(15);
			check[numA]= true;
		}
		//comprobar que todas las posiciones sean true
		for (int i = 0; i < check.length; i++) {
			assertTrue(check[i]);
			
		}
	//assertTrue(numA<15);
	
	}

}
