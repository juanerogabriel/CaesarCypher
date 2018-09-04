
public class CaesarCypher {
	
	private int key;//si se cambia el private por public, en el class main no habria problema, si se cambia a private hay problema, no comparte al otro class
	
	private final static String alphabet =  "ABCDEFGHIJKLMNOPQRSTUVWYZ";

	//PRIVATE- otras clases no saben esa propiedad
	//FINAL- el valor de esa final siempre sera el alfabeto
	//STATIC- todas las instancias las comparten
	
	private static String shiftedAlphabet;/* = "EFGHIJKLMNOPQRSTUVWXYZABCD"*/
	
	public CaesarCypher(int key) { //Esto es un constructor, por eso puede tneer el mismoo nombre del class
		//constructor es un metodo que inicializa los valores de las propiedades que tiene cada instancia de una clase
		
		this.key = key;  //this. objeto especial que llama una instancia
		String leftSubstring = alphabet.substring(0, key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
	}
	
	public String encode (String clearText) {
		String cypherText = "" ; //si quiero cambiar el nombre de una variable le doy doble click, refractor, rename
		for(int i=0; i<clearText.length(); i++) {
			cypherText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		return cypherText;
		
	}
	
}
