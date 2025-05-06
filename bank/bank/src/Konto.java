
import java.util.prefs.BackingStoreException;

public class Konto {
// Atributen
long kontoNr;
long kontostand;
Bank bank;
Kunde inhaber;

//Konsruktoren
public Konto(long kontoNr, Bank b, Kunde k){
    this.kontoNr = kontoNr;
    this.bank = b;
    this.inhaber = k;
    this.kontostand = 0;
} 
//Methoden
public void auszahlen(long cent){
    this.kontostand -= cent;
}
public void  einzahlen(long cent) {
    this.kontostand += cent;
}

    /**
* Geldbeträge werden in Cent angegeben. Das gewünschte Verhalten des Konstruktors und der Methoden ist im Folgenden beschrieben:
* Konto(long kontoNr, Bank b, Kunde k): Der Konstruktor soll die Informationen über Kontonummer, zugehörige Bank und den Kontoinhaber speichern. Der Kontostand eines neuen Kontos soll 0 Euro betragen
* void auszahlen(long cent): Hier soll der Kontostand um den angegebenen Betrag verringert werden. Sie müssen sich keine Gedanken um eine mögliche Überziehung machen.
* void einzahlen(long cent): Hier soll der Kontostand um den angegebenen Betrag erhöht werden.
* String liefereBankname(): Der Name der zugehörigen Bank soll zurückgeliefert werden.
* long liefereBLZ(): Die Bankleitzahl der zugehörigen Bank soll zurückgeliefert werden.
* String liefereInhabername(): Der Name des Kontoinhabers soll zurückgeliefert werden.
* long liefereKontonummer(): Die Kontonummer soll zurückgeliefert werden.
* long liefereKontostand(): Die aktuelle Kontostand (in Cent) soll zurückgeliefert werden.
 */
    
}
