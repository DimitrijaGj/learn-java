

/**
 * Programm zur Berechnung des Durschnittes aus einem Array von int-Zahlen.
 */
public class Durchschnitt {

	/**
	 * Methode zur Berechnung des Durchschnittes eines Arrays 
	 * von nichtnegativen int-Zahlen.
	 * 
	 * @param feld ein Array von int-Zahlen.
	 * @return Der berechnete Durchschnitt der Zahlen im Array.
	 */
	

	public double berechneDurchschnitt(int[] feld) {
		// TODO: Hier bitte die entsprechende Berechnung ergaenzen.
		// Check ob Numer  nicht negativ isaddieren die zusammen
		// Summe teilen durch Länge der Arrays
		System.out.println("is this working");
		return 0;
	}
	
	public static void main(String[] args) {
        Durchschnitt d = new Durchschnitt();
        int[] testArray = {1, 2, 3, 4, 5};
        double result = d.berechneDurchschnitt(testArray);
        System.out.println("Durchschnitt: " + result);
    }
}
