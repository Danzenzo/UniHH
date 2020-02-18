import java.io.File;

/**
 * Schreibt den Dateinamen inklusive Pfad auf die Konsole.
 * 
 * @author Daniel
 * @version 6. Dezember 2015
 */
class LangAuflister implements DateiVerarbeiter
{
    /**
     * @see Dateiverarbeiter.verarbeite
     */
    public void verarbeite(File datei)
    {
        System.out.println(datei.getAbsolutePath());
    }
}
