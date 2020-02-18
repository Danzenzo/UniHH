
/**
 * Implementation fuer den Typ Spielfeld
 * 
 * @author Daniel
 */
public class ArraySpielfeld implements Spielfeld
{

    // enthaelt die Inforamtionen des Spielfelds
    // Array deklarieren
    private final int[] _positionen;

    // Groesse des Spielfeld 
    private static final int GROESSE = 9;

    /**
     * Constructor for objects of class ArraySpielfeld
     */
    public ArraySpielfeld() 
    {
        // Array erzeugen
        _positionen = new int[GROESSE];
    }
/**
 * @see Spielfeld.gibBesitzer
 */
    public int gibBesitzer(int position)
    {
        if (position < 0 || position >= _positionen.length) 
        {
            System.out.println("Position " + position + " liegt nicht im Array");
        }
        // Array lesen
        return _positionen[position];
    }

    /**
     * Besetzt die angegebene Position auf dem Spielfeld fuer einen Spieler.
     * 
     * @param position 0..8
     * @param spieler 1 (Spieler 1), 2 (Spieler 2)
     */
    public void besetzePosition(int position, int spieler)
    {
        if (position < 0 || position >= _positionen.length) 
        {
            System.err.println("Position " + position + " liegt nicht im Array");
        }

        // man kann hier auch pruefen ob spieler 1 oder 2 ist
        // Array schreiben
        _positionen[position] = spieler;
    }

    /**
     * Gibt an, ob das Spielfeld an allen _positionen belegt ist.
     */
    public boolean istVoll()
    {
        for (int i : _positionen) 
        {
            if (i == 0) // es gibt eine unbesetzte Position
            {
                return false;
            }
        }

        return true;
    }

}
