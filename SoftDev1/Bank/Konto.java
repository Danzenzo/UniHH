
/**
 * Diese Klasse dient zur Veranschaulichung einer Kontoverwaltung.
 * 
 * @author Daniel
 * @version 11.11.2015
 */
class Konto
{
    private int _saldo;
    private final int _Kontonummer;
    
    /**
     * Erzeuge ein Konto mit Kontonummer und einem Startguthaben von 10 Euro.
     * @param Kontonummer die Kontonummer in Ziffern.
     */
    public Konto(int Kontonummer)
    {
        _saldo = 10;
        _Kontonummer = Kontonummer;
    }
    
    /**
     * Zahle einen Betrag auf das Konto ein.
     * @param betrag der einzuzahlende Betrag in Euro.
     */
    public void zahleEin(int betrag)
    {
        _saldo = _saldo + betrag;
    }
    
    /**
     * Hebe einen Betrag vom Konto ab.
     * @param betrag der abzuhebende Betrag in Euro.
     */
    public void hebeAb(int betrag)
    {        _saldo = _saldo - betrag;
       
    }

    /**
     * Der Kontostand des Kontos wird angezeigt.
     * @return Saldo des Kontos in Euro.
     */
    public int gibSaldo()
    {
        return _saldo;
    }
    
    /**
     * Die Kontonummer des Kontos wird angezeigt.
     * @return Kontonummer des Kontos in Ziffern.
     * 
     */public int gibKontonummer()
    {
        return _Kontonummer;
    }
}

