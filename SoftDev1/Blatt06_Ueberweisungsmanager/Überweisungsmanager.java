
/**
 * Beschreiben Sie hier die Klasse Überweisungsmanager.
 * 
 * @author Daniel
 * @version 25.11.2015
 */
class Überweisungsmanager
{
/**
 * Überweist einen Betrag von einem Konto zu einem anderen.
 * @param quellKonto Das Quellkonto (ist ein Objekt)
 * @param zielKonto Das Zielkonto (ist ein Objekt)
 * @param betrag Der Betrag
 */
    public void ueberweisen(Konto quellKonto, Konto zielKonto, int betrag)
    {
        if (quellKonto != null && zielKonto != null && quellKonto != zielKonto)
        {
            quellKonto.hebeAb(betrag);
            zielKonto.zahleEin(betrag);
        }
    }
}

