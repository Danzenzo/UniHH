import java.io.File;

/**
 * Schreibt den Dateinamen exklusive Pfad auf die Konsole.
 * 
 * @author Daniel
 * @version 6. Dezember 2016
 */
class KurzAuflister implements DateiVerarbeiter
{
    /**
     * @see Dateiverarbeiter.verarbeite
     */
    public void verarbeite(File datei)
    {
        System.out.println(datei.getName());
    }
}
