public class PrimzahlTester {
    /**
     * prueft ob die uebergebene nichtnegative Zahl eine Primzahl ist
     * wenn die uebergebene Zahl eine Primzahl ist, wird JA ausgegeben
     * ansonsten NEIN
     * Eine Primzahl ist eine Zahl, die nur durch 1 und sich selbst (ohne Rest) teilbar ist.
     * @param n die zu testende nichtnegative Zahl
     */
    public void istPrimzahl(long n) {
        n = 5L;
       // pruf ob zahl is durch sich selber teilbar ist ohne Rest
        if (n > 2L && n % n == 0L) {
            System.out.println("JA");
        }
        else {
            System.out.println("NEIN");

        }
    }

    public static void main(String[] args) {
        PrimzahlTester tester = new PrimzahlTester();
        tester.istPrimzahl(7); // Example: Test if 7 is a prime number
    }
}