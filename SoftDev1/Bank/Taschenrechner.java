
/**
 * Bei dieser Klasse soll ein bisher errechnetes Zwischenergebnis erneut ausgegeben werden.
 * Der Anfangswert beträgt 0.0(double)
 * 
 * @author Daniel
 * @version 11.11.2015
 */
class Taschenrechner
{
    private double _zwischenergebnis = 0.0;

    /**
     * Addition zweier Zahlen.
     * @param zahl in Ziffern.
     * @return Rückgabe des Zwischenergebnisses.
     */
    public double addiere (double zahl)
    {
        _zwischenergebnis = _zwischenergebnis + zahl;
        return _zwischenergebnis;
    }

    /**
     * Anzeige des Zwischenergebnisses.
     * @return Rückgabe des Zwischenergebnisses.
     */
    public double gibZwischenergebnis()
    {
        return _zwischenergebnis;
    }

    /**
     * Subtraktion zweier Zahlen.
     * @param zahl in Ziffern.
     * @return Rückgabe des Zwischenergebnisses.
     */
    public double subtrahiere (double zahl)
    {
        _zwischenergebnis = _zwischenergebnis - zahl;
        return _zwischenergebnis;
    }

    /**
     * Multiplikation zweier Zahlen.
     * @param zahl in Ziffern.
     * @return Rückgabe des Zwischenergebnisses.
     */
    public double multipliziere (double zahl)
    {
        _zwischenergebnis = _zwischenergebnis * zahl;
        return _zwischenergebnis;
    }

    /**
     * Division zweier Zahlen.
     * @param zahl in Ziffern.
     * @return Rückgabe des Zwischenergebnisses.
     */public double dividiere (double zahl)
    {
        _zwischenergebnis = _zwischenergebnis / zahl;
        return _zwischenergebnis;
    }

    /**
     * Setzt den Zustand wieder auf den Anfangswert zurück.
     * @return Rückgabe des Zwischenergebnisses.
     */
    public double loesche ()
    {
        _zwischenergebnis = 0.0;
        return _zwischenergebnis;
    }

    /**
     * Bestimmt den Betrag einer Zahl.
     * @param zahl in Ziffern.
     * @return liefert den Wert der Zahl in Ziffern.
     */
    public double betrag(double zahl)
    {
        return Math.abs(zahl);
    }

    /**
     * Zieht die Wurzel einer Zahl.
     * @param zahl in Ziffern.
     * @return liefert die Wurzel einer Zahl in Ziffern.
     */
    public double wurzel(double zahl)
    {
        return Math.sqrt(zahl);
    }

    /**
     * Berechnet die Potenz einer Zahl.
     * @param x,y in Ziffern.
     * @return liefert die Potenz einer Zahl in Ziffern.
     */
    public double potenz(double x, double y)
    {
        return Math.pow(x,y);
    }

    /**
     * Berechnet den Sinuswert einer Zahl.
     * @param Zahl in Ziffern.
     * @return liefert den Sinuswert einer Zahl in Ziffern.
     */
    public double sinus(double zahl)
    {
        return Math.sin(zahl);
    }

    /**
     * Berechnet den Cosinuswert einer Zahl.
     * @param Zahl in Ziffern.
     * @return liefert den Cosinuswert einer Zahl in Ziffern.
     */
    public double cosin(double zahl)
    {
        return Math.cos(zahl);
    }

    /**
     * Berechnet den Tangenswert einer Zahl.
     * @param Zahl in Ziffern.
     * @return liefert den Tangenswert einer Zahl in Ziffern.
     * 
     */
    public double tangi(double zahl)
    {
        return Math.tan(zahl);
    }

}