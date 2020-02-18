import java.io.File;

/**
 * Schreibt den Dateinamen der Textdateien auf die Konsole.
 * 
 * @author Daniel
 * @version 16.12.2015
 */
class TxtAuflister implements DateiVerarbeiter
{
    /**
     * @see Dateiverarbeiter.verarbeite
     */
    public void verarbeite(File datei)
    {
        if (datei.getName().substring(datei.getName().length()-4).equals(".txt"))
        {
            System.out.println(datei.getName()); 
        }  
        }
   }


