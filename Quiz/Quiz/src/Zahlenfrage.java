public interface Zahlenfrage {
    boolean istBeantwortet();
    int liefereFrage();
    int liefereMoeglichePunkte();
    void legeAntwortFest(int antwort);

}
