public class MeinMietPreisBerechner {
    public long berechneMietpreis(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		int Mietdauer = tage;
        int Kilometer = km;
        int Pauschale = 0;
        if (Mietdauer < 1) {
            throw new UngueltigeTagesanzahlAusnahme();
        }

	}

}
