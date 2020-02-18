/**
 * Diese Klasse bietet die Moeglichkeit, Texte zu analysieren.
 * Sie dient als Einstieg in Schleifenkonstrukte und zeigt in
 * der Methode istFrage beispielhaft einige Methodenaufrufe an
 * einem Objekt der Klasse String.
 * 
 * @author Daniel
 */
class TextAnalyse
{
    /**
     * Ermittelt, ob es sich bei dem uebergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschliessenden Fragezeichen.
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrage(String text)
    {
        if (text.length() == 0)
        {
            return false;
        }
        int anzahlZeichen = text.length();

        int letztePosition = anzahlZeichen - 1;

        char letztesZeichen = text.charAt(letztePosition);

        boolean endetAufFragezeichen = (letztesZeichen == '?');

        return endetAufFragezeichen;
    }

    /**
     * Ermittelt, ob es sich bei dem uebergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschliessenden Fragezeichen.
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrageKompakt(String text)
    {
        return text.charAt(text.length() - 1) == '?';
    }

    public int zaehleVokale(String text)
    {
        int zaehler=0;
        for(int i=0;i<text.length();i++)
        {

            switch(text.charAt(i))
            {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                zaehler++;
                break;
            }
        }
        return zaehler;
    }
    
    public boolean istPalindrom(String text)
    {
        for(int a=0, b=text.length()-1;a<b; a++, --b)
        {
            if ( Character.toLowerCase(text.charAt(a)) !=Character.toLowerCase(text.charAt(b)) )
            {
                return false;
            }
                         
        }
        return true;
    }
}