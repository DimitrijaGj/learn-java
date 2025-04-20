public class WochentagBerechner {

	/**
	 * es wird der Wochentag zu einem gueltigen Datum bestimmt
	 * 
	 * @param tag der Tag (0 < tag <= 31)
	 * @param monat der Monat (0 < monat <= 12)
	 * @param jahr die vierstellige Jahreszahl (z. B. 2009)
	 */
	public void berechneWochentag(int tag, int monat, int jahr) {
	}
	
	public static void main(String[] args) {
		// Diese Variablen koennen sie veraendern, um Ihre
		// Implementierung zu testen
		int t = 1; // der Tag
		int m = 5; // der Monat
		int j = 2010; // das Jahr
		// Der nachfolgende Quelltext erzeugt nur die Ausgabe
		System.out.print("Der ");
		System.out.print(t);
		System.out.print(".");
		System.out.print(m);
		System.out.print(".");
		System.out.print(j);
		System.out.print(" ist ein ");
		new WochentagBerechner().berechneWochentag(t, m, j);
	}


}
