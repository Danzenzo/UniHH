/**
 * Ein Zeitmesser misst die Zeit, die seit seiner Erzeugung vergangen ist.
 * 
 * @author Daniel
 * @version 12. November 2015
 */
class Zeitmesser
{
    private final long _ersteMessung;
    private long _letzteMessung;

    /**
     * Die Zeitmessung beginnt bei der Erzeugung.
     */
    public Zeitmesser()
    {
        _letzteMessung = _ersteMessung = System.nanoTime();
    }

    /**
     * Diese Methode sollte pro Animationsschritt nur 1x aufgerufen werden,
     * damit alle Klienten mit demselben Wert arbeiten!
     */
    public void notiereAktuelleZeit()
    {
        _letzteMessung = System.nanoTime();
    }

    /**
     * Bestimmt, wie viel Zeit zwischen der Erzeugung des Zeitmessers und dem
     * letzten Aufruf von notiereAktuelleZeit vergangen ist.
     * 
     * @return die vergangene Zeit in Sekunden, mit Nanosekunden-Genauigkeit
     */
    public double abgelaufeneSekunden()
    {
        return (_letzteMessung - _ersteMessung)/ 360000; // 1e9;
    }
}
