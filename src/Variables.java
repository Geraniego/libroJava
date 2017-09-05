import java.text.NumberFormat;

/**
 * Ejercicio para probar las variables de java
 * 
 * @author Administrador
 *
 */
public class Variables {
	public static void main(String[] args) {
		/*
		 * 
		 *HOLA ANDER TQM
		 * System.out.println("Ejercicio con Variables");
		 * System.out.println("Enteros :");
		 * 
		 * //TODO terminar de poner el resto
		 * System.out.println("int "+Integer.BYTES+" bytes entero "+
		 * Integer.MIN_VALUE+" - "+Integer.MAX_VALUE); /*System.out.println("byte:");
		 * System.out.println("byte "+ Byte.BYTES + " bytes byte "+ Byte.MIN_VALUE +
		 * " - "+ Byte.MAX_VALUE); System.out.println("Reales :");
		 * System.out.println(" :"); System.out.println("Reales: "); float
		 * sueldoMesGerman =(float) 1200.25; float sueldoMesLander = 2400.50f; String s
		 * = String.valueOf(sueldoMesGerman); s = s.replace(".", ",");
		 * System.out.println("German cobra : "+/*s
		 * NumberFormat.getInstance().format(sueldoMesGerman) +"�");
		 * 
		 * // TODO declarar una variable primitica de cada tipo y usar su wraper
		 */
		System.out.println("Ejercicio con Variables");

		System.out.println("1. Enteros");
		System.out.println("2. Reales");
		System.out.println("3. Boleanas");
		System.out.println("1. Caracteres");

		System.out.println("Enteros:");

		// TODO terminar de poner el resto
		System.out.println("int " + Integer.BYTES + " bytes entero " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		float sueldoMesGerman = 1200.23f;
		System.out.println("German cobra " + NumberFormat.getInstance().format(sueldoMesGerman) + " � al mes");

		String sSueldoGerman = String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');
		System.out.println("German cobra " + sSueldoGerman + " � al mes");

		System.out.println("Reales:");
		System.out.println("float : " + Float.BYTES + " bytes " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
		System.out.println("double : " + Double.BYTES + " bytes " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
		System.out.println("BOOLEANAS ");
		System.out.println("Boolean: " + Boolean.toString(true) + " Verdadero - " + Boolean.toString(false) + " Falso");
		System.out.println("Caracteres");
		
		/*Comprobacion de caracteres de manera simple, solo con true y false*/
		System.out.println("-----------------------------------------------------------");
		System.out.println("Solo con true y false");
		System.out.println("CARACTER----DIGITO----LETRA----MAYUS---MINUSCULA");
		char a = 'a';
		char f = 'F';
		char nu = '3';
		char j = 'j';
		String s = null;
		s = "--------" + a + "----" + Character.isDigit(a) + "----" + Character.isLetter(a) + "----"
				+ Character.isUpperCase(a) + "----" + Character.isLowerCase(a);
		System.out.println(s);
		s = "--------" + f + "----" + Character.isDigit(f) + "----" + Character.isLetter(f) + "----"
				+ Character.isUpperCase(f) + "----" + Character.isLowerCase(f);
		System.out.println(s);
		s = "--------" + nu + "----" + Character.isDigit(nu) + "----" + Character.isLetter(nu) + "----"
				+ Character.isUpperCase(nu) + "----" + Character.isLowerCase(nu);
		System.out.println(s);
		s = "--------" + j + "----" + Character.isDigit(j) + "----" + Character.isLetter(j) + "----"
				+ Character.isUpperCase(j) + "----" + Character.isLowerCase(j);
		System.out.println(s);
		System.out.println("-------------------------------------------------------");

		// TODO declarar una varaible primtiva de cada tipo y usar su Wrapper
		/*Comprobacion de Caracteres usando 'tick' y 'cross'*/
		char c = '\u2714';
		char n = '\u2716';
		System.out.println("------------------------------------------");
		System.out.println("Con Tick y con Cross");
		System.out.println("CARACTER-DIGITO-LETRA-MAYUS-MINUSCULA");
		s = "------" + a + "----" + (Character.isDigit(a) ? c : n) + "----" + (Character.isLetter(a) ? c : n) + "----"
				+ (Character.isUpperCase(a) ? c : n) + "----" + (Character.isLowerCase(a) ? c : n);
		System.out.println(s);
		s = "------" + f + "----" + (Character.isDigit(f) ? c : n) + "----" + (Character.isLetter(f) ? c : n) + "----"
				+ (Character.isUpperCase(f) ? c : n) + "----" + (Character.isLowerCase(f) ? c : n);
		System.out.println(s);
		s = "------" + nu + "----" + (Character.isDigit(nu) ? c : n) + "----" + (Character.isLetter(nu) ? c : n)
				+ "----" + (Character.isUpperCase(nu) ? c : n) + "----" + (Character.isLowerCase(nu) ? c : n);
		System.out.println(s);
		s = "------" + j + "----" + (Character.isDigit(j) ? c : n) + "----" + (Character.isLetter(j) ? c : n) + "----"
				+ (Character.isUpperCase(j) ? c : n) + "----" + (Character.isLowerCase(j) ? c : n);
		System.out.println(s);
		/*Comprobacion de caracteres Utilizando 'Tick' y 'Cross' y ademas utilizando un Array*/
		System.out.println("-------------------------------------------------------");
		System.out.println("Con tick y Cross pero los caracteres almacenados en un Array");
		System.out.println("CARACTER----DIGITO----LETRA----MAYUS---MINUSCULA");
		char[] caracteres = { 'a', 'F', '3', 'j' };
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("-------" + caracteres[i] + "------" 
					+(Character.isDigit(caracteres[i]) ? c : n)+ "------" 
					+(Character.isLetter(caracteres[i]) ? c : n) + "------"
					+ (Character.isUpperCase(caracteres[i]) ? c : n) + "------"
					+ (Character.isLowerCase(caracteres[i]) ? c : n));
		}
		System.out.println("-------------------------------------------------------");
		/*Comprobacion de caracteres Utilizando 'Tick' y 'Cross' y ademas utilizando un Array y tambien utilizando el metodo dameSimbolo()*/
		System.out.println("-------------------------------------------------------");
		System.out.println("Con tick y Cross pero los caracteres almacenados en un Array usando la funcion dameSimbolo()");
		System.out.println("CARACTER----DIGITO----LETRA----MAYUS---MINUSCULA");
		
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("-------" + caracteres[i] + "------" 
					+(dameSimbolo(Character.isDigit(caracteres[i])))+ "------" 
					+(dameSimbolo(Character.isLetter(caracteres[i]))) + "------"
					+ (dameSimbolo(Character.isUpperCase(caracteres[i]) )) + "------"
					+ (dameSimbolo(Character.isLowerCase(caracteres[i])))) ;
		}
		System.out.println("-------------------------------------------------------");
	}
	/**
	 * es un valor true o false para identificar que marca ha de devolver
	 * @param valor 
	 * 
	 * retorna un caracter unicode para el Tick u otro para el Cross
	 * @return 
	 * 
	 */
	/*Metodo que nos devuelve un char de Tick o un Cross*/
	public static char dameSimbolo(boolean valor) {
		char c = '\u2714';
		char n = '\u2716';
		//char r= 's';
		char r = valor?c:n;
		return r;
	}
}
