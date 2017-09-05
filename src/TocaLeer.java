
public class TocaLeer {

	/**
	 * @param args
	 */
	static String [] alumnos = {"Arkaitz",
			"Erlantz",
			"Fran", 
			"Christian",
			"Leire",
			"Mikel",
			"Josu",
			"Alberto",
			"Jon",
			"Lander",
			"German"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numA=generarNumeroAleatorio(alumnos.length);
		 //numA = (int) (Math.random()*alumnos.length);
		 String af = "Ander";
		 af = alumnos[numA];
		 System.out.println("El Afortuna@ es : " + af);
	}
	/**
	 * El metodo es util para generar un numero aleatorio ente 0 y <code> max</code> indicado
	 * @param max  es el numero maximo que puede generar la funcion
	 * @return  Un numero aleatorio entre 0 y max que nos devuelve la funcion
	 */
public static int generarNumeroAleatorio(int max){
	int numer = 0;
	numer = (int)(Math.random()*max);
	return numer;
	
	//TODO falta implementar logica
	/**
	 * En este metodo pasamos el limite inferior y el limite superior
	 *  para asi conseguir un numero aleatorio entre dichos numeros
	 * */
	
	
}
}
