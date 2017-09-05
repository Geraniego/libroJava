
public class HelloWorld {
final int DIAS_SEMANA=7;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HOLA MUNDO!!");
		
		String [] alumnos = {
				"Ander",
				"Arkaitz",
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
		
		System.out.println("<<<Listado de Alumn@s>>>");
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(i+1+" - "+ alumnos[i]);
		}
		
		

	}

}
