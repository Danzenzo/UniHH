
/**
 * Beschreiben Sie hier die Klasse Uhrenanzeige.
 * 
 * @author Jonas und Daniel 
 * @version 25.11.2015
 */
class Uhrenanzeige
{
    Nummernanzeige Uhr1 = new Nummernanzeige(60);
    Nummernanzeige Uhr2 = new Nummernanzeige(24);
    /**
     * initialisiert die Uhrzeit für Uhr1 und Uhr2 in Minuten und Stunden
     * @param h Stunden
     * @param min Minuten
     */
    public Uhrenanzeige(int h, int min)
    {
     Uhr1.setzeWert(min);
     Uhr2.setzeWert(h);
    }
    /**
     * Gibt die Uhrzeit als String aus.
     * @return Die Uhrzeit.
     */
    public String gibUhrzeitAlsString()
    {
        return Uhr2.gibAnzeigeWert()+":"+Uhr1.gibAnzeigeWert();
    }
    /**
     * Setze die Uhrzeit auf einen Wert.
     * @param h Die Stunden.
     * @param min Die Minuten.
     */
    public void setzeUhrzeit(int h, int min)
    {
        Uhr1.setzeWert(min);
        Uhr2.setzeWert(h);
    }
    
    /**
     * Erhöht die Minuten um 1.
     *
     */
    public void taktsignalGeben()
    {
        Uhr1.erhoehen();
        if (Uhr1.gibWert() == 0)
        {
            Uhr2.erhoehen();
        }
    }
}

