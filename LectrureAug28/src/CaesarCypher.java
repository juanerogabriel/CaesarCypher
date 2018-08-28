
public class CaesarCypher {
	
	private int key;
	
	private final static String alphabet =  "ABCDEFGHIJKLMNOPQRSTUVWYZ";

	//PRIVATE- otras clases no saben esa propiedad
	//FINAL- el valor de esa final siempre sera el alfabeto
	//STATIC- todas las instancias las comparten
	
	private static String shiftedAlphabet/* = "EFGHIJKLMNOPQRSTUVWXYZABCD"*/;
	
	public CaesarCypher(int key) { //Esto es un constructor, por eso puede tneer el mismoo nombre del class
		this.key = key;  //this. objeto especial que llama una instancia
		String leftSubstring = alphabet.substring(0, key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
		
	}
	
}
