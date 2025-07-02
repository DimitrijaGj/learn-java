public class Stapel {
    private StapelElement oberstes;
    private long groesse;

    public Stapel() {
        oberstes = null;
        groesse = 0;
    }

    public void fuegeElementHinzu(String s) {
        StapelElement neu = new StapelElement(s, oberstes);
        oberstes = neu;
        groesse++;
    }

    public String entferneOberstesElement() {
        if (oberstes == null) {
            return null;
        }
        String wert = oberstes.getWert();
        oberstes = oberstes.getNaechstes();
        groesse--;
        return wert;
    }

    public String liefereOberstesElement() {
        if (oberstes == null) {
            return null;
        }
        return oberstes.getWert();
    }

    public long liefereGroesse() {
        return groesse;
    }

    public boolean istLeer() {
        return groesse == 0;
    }
}
