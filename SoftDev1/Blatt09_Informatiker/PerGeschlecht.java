/**
 * Vergleicht zwei Personen anhand ihres Geschlechts.
 * 
 * @author Daniel
 * @version 16.12.2015
 */
class PerGeschlecht implements Vergleicher
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int vergleiche(Person a, Person b)
    {
        if (a.istMaennlich() == b.istMaennlich())
        {
            return 0;
        }
        else if (!a.istMaennlich() &&  b.istMaennlich())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
