public class UngueltigeKilometerangabeAusnahme extends Exception {
    private UngueltigeKilometerangabeAusnahme(double km) {
        super("You entered negatives Kilometerenzahl " + km + ".");
    }
}
