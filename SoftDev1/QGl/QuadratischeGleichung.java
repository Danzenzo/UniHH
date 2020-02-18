
/**
 * Die Klasse löst eine guadratische Gleichung.
 * 
 * @author Daniel, Ronja 
 * @version 18.11.2015
 */
class QuadratischeGleichung
{
    private double ersterKoeffizient;
    private double zweiterKoeffizient;
    private double dritterKoeffizient;
    
    /**
     * Löst eine quadraticshe Gleichung.
     * @param a Der erste Koeffizient
     * @param b Der zweite Koeffizient
     * @param c Der dritte Koeffizient
     */
    public QuadratischeGleichung (int a, int b, int c)
    {
        ersterKoeffizient =  a;
        zweiterKoeffizient =  b;
        dritterKoeffizient =  c;
    }
    
    /**
     * Löst die erste Nullstelle.
     * @return Die erste Nullstelle.
     */
    public double ersteNullstelle ()
    {
        double a = ersterKoeffizient;
        double b = zweiterKoeffizient;
        double c = dritterKoeffizient;
        return (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    }
    
    /**
     * Löst die zweite Nullstelle.
     * @return Die zweite Nullstelle.
     */
     public double zweiteNullstelle ()
    {
        double a = ersterKoeffizient;
        double b = zweiterKoeffizient;
        double c = dritterKoeffizient;
        return (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    }
    /**
     * Gibt die Anzahl der Nullstellen zurück.
     * @return Die Anzahl der Nullstellen.
     */
    public int anzahlNullstellen()
    {
        double a = ersterKoeffizient;
        double b = zweiterKoeffizient;
        double c = dritterKoeffizient;
        int anzahl = 2;
        if ((-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a) == Double.NaN)
        {
            anzahl =-1;
        }
        if ((-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a) == Double.NaN)
        {
            anzahl =-1;
        }
        return anzahl;
    }
    
}

