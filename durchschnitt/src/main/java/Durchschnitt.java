

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
		if (feld == null || feld.length == 0) {
            return 0.0;
        }
        
        double summe = 0;
        for (int zahl : feld) {
            if (zahl < 0) {
                System.out.println("Negative Zahlen sind nicht erlaubt: " + zahl);
            }
            summe += zahl;
        }
        
        return summe / feld.length;
    }
    
    public static void main(String[] args) {
        Durchschnitt rechner = new Durchschnitt();
        	// Beispiel mit positiven Zahlen
            int[] zahlen = {5, 10, 15, 20, 25};
            double ergebnis = rechner.berechneDurchschnitt(zahlen);
            System.out.println("Der Durchschnitt ist: " + ergebnis);
            
            // Beispiel mit einer negativen Zahl - wird Exception werfen
            int[] ungueltigeZahlen = {5, -10, 15};
            rechner.berechneDurchschnitt(ungueltigeZahlen);
        
    }
}
