/**
 * Vergleicht zwei Personen anhand ihrer Vornamen.
 * 
 * @author Daniel
 * @version 16.12.2015
 */
class PerVorname implements Vergleicher<Person>
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int vergleiche(Person a, Person b)
    {
        // Achtung: Dieser Trick funktioniert nur, wenn die Differenz garantiert in einen int passt.
        return a.gibVorname().compareTo(b.gibVorname());
    }
}
