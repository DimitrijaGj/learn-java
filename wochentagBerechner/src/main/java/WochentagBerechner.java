
public class WochentagBerechner {

	/**
	 * es wird der Wochentag zu einem gueltigen Datum bestimmt
	 * 
	 * @param tag der Tag (0 < tag <= 31)
	 * @param monat der Monat (0 < monat <= 12)
	 * @param jahr die vierstellige Jahreszahl (z. B. 2009)
	 */
	public void berechneWochentag(int tag, int monat, int jahr) {
		int t = tag;
		int m = monat;
		if (m == 1) {
			m = 13;
		}
		if (m == 2) {
			m = 14;
		}
		int j = jahr;
		int c = jahr/100 + 1;
		int w;
		System.out.println(b);
		w = (t + (26 * (m + 1))/10 + (5 * j)/4 + c/4 + 5 * c - 1) % 7;
		switch(w){
			case 0: 
				System.out.println("Montag");
				break;
			case 1:
				System.out.println("Dienstag");
				break;
			case 2:
				System.out.println("Mittwoch");
				break;
			case 3:
				System.out.println("Donnerstag");
				break;
			case 4:
				System.out.println("Freitag");
				break;
			case 5:
				System.out.println("Samstag");
				break;
			case 6:
				System.out.println("Sonntag");
				break;
			default:
				System.out.println("Das ist kein Tag");
		}
	}
	
	public static void main(String[] args) {
		// Diese Variablen koennen sie veraendern, um Ihre
		// Implementierung zu testen
		int t = 20; // der Tag
		int m = 2; // der Monat
		int j = 2025; // das Jahr
		// Der nacholgende Quelltext erzeugt nur die Ausgabe
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
