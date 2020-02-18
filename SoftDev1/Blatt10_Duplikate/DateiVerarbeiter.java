import java.io.File;

/**
 * Ein DateiVerarbeiter verarbeitet eine Datei.
 * 
 * @author Daniel
 */
interface DateiVerarbeiter
{
    /**
     * Diese Methode wird vom VerzeichnisWanderer fuer jede Datei aufgerufen.
     * Was konkret mit jeder einzelnen Datei passiert, legen die implementierenden Klassen fest.
     */
    public void verarbeite(File datei);
}
