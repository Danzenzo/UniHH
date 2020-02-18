
/**
 * Beschreiben Sie hier die Klasse Lotto.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class Lotto
{
    //Zahlensack zahlensack;
    public void sechsAus49 (Zahlensack zahlensack)
    {
       //zahlensack = new Permutation(49);
        for (int i = 0; i<6; i++)
        {
           System.out.println(zahlensack.entferneZahl()+1); 
        }
    }
}
