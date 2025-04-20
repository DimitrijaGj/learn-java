public class WochentagBerechner {

	/**
	 * es wird der Wochentag zu einem gueltigen Datum bestimmt
	 * 
	 * @param tag der Tag (0 < tag <= 31)
	 * @param monat der Monat (0 < monat <= 12)
	 * @param jahr die vierstellige Jahreszahl (z. B. 2009)
	 */
	public void berechneWochentag(int tag, int monat, int jahr) {
		// Calculate the day
		// 0 = Sonntag, 1 = Montag, 2 = Dienstag, 3 = Mittwoch, 4 = Donnerstag, 5 = Freitag, 6 = Samstag
		// 0 = Sonntag, 1 = Montag, 2 = Dienstag, 3 = Mittwoch, 4 = Donnerstag, 5 = Freitag, 6 = Samstag	
		int t = tag;
		int m = monat;
		int j = jahr;	
		int c = j / 100; // Jahrhundert
		int k = j % 100; // Jahr innerhalb des Jahrhunderts
		if (m < 3) {
			m += 12; // Januar und Februar als 13. und 14. Monat des Vorjahres
			j--;
		}
		// Berechnung des Wochentags
		// w = (t + (13 * (m + 1))/5 + k + (k/4) + (c/4) - 2*c) % 7;

		int w;
		w = (t + (26 * (m + 1))/10 + (5 * j)/4 + c/4 + 5 * c - 1) % 7;

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
