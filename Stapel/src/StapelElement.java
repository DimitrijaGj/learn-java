public class StapelElement {
    private String wert;
    private StapelElement naechstes;

    public StapelElement(String wert, StapelElement naechstes) {
        this.wert = wert;
        this.naechstes = naechstes;
    }

    public String getWert() {
        return wert;
    }

    public StapelElement getNaechstes() {
        return naechstes;
    }
}
