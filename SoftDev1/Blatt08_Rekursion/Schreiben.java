/**
 * In dieser Klasse sind rekursive Algorithmen umzusetzen.
 * 
 * @author Daniel
 */
class Schreiben
{
    /**
     * Liefert die Fakultaet von n, also das Produkt aller natuerlicher Zahlen bis n.
     * Die Fakultaet von 0 ist per mathematischer Definition 1.
     *
     * Beispielauswertung:
     * 
     *   fak(4)
     * -> 4 * fak(3)
     * -> 4 * (3 * fak(2))
     * -> 4 * (3 * (2 * fak(1)))
     * -> 4 * (3 * (2 * (1 * fak(0))))
     * -> 4 * (3 * (2 * (1 * 1)))
     * -> 4 * (3 * (2 * 1))
     * -> 4 * (3 * 2)
     * -> 4 * 6
     * -> 24
     */
    public int fak(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        else
        {
            return n * fak(n-1);
        }
    }

    /**
     * Gibt an, ob die Zeichenkette einen Vokal enthaelt. Auswertungen:
     * 
     * enthaeltVokal("brei") -> enthaeltVokal("rei") -> enthaeltVokal("ei") -> true
     * enthaeltVokal("xyz") -> enthaeltVokal("yz") -> enthaeltVokal("z") -> enthaeltVokal("") -> false
     */
    public boolean enthaeltVokal(String s)
    {   
        switch (s.charAt(0))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
        }
        if (s.length() == 1)
        {
            return false;
        }
        return enthaeltVokal(s.substring(1));
    }

    /**
     * Gibt an, ob die Zeichenkette ein Palindrom ist. Auswertungen:
     * 
     * istPalindrom("anna") -> istPalindrom("nn") -> istPalindrom("") -> true
     * istPalindrom("asta") -> istPalindrom("st") -> false
     * istPalindrom("axa") -> istPalindrom("x") -> true
     * istPalindrom("xyz") -> false
     */
    public boolean istPalindrom(String s)
    {
        if (s.length() == 0 || s.length() == 1)
        {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length()-1)) 
        {
            return istPalindrom(s.substring(1, s.length()-1));
        }
        return false;
    }

    /**
     * Berechnet die Anzahl Leerzeichen in der Zeichenketten. Auswertung:
     * 
     * anzahlLeerzeichen("a bc d")
     * -> 0 + anzahlLeerzeichen(" bc d")
     * -> 0 + (1 + anzahlLeerzeichen("bc d"))
     * -> 0 + (1 + (0 + anzahlLeerzeichen("c d")))
     * -> 0 + (1 + (0 + (0 + anzahlLeerzeichen(" d"))))
     * -> 0 + (1 + (0 + (0 + (1 + anzahlLeerzeichen("d")))))
     * -> 0 + (1 + (0 + (0 + (1 + (0 + anzahlLeerzeichen(""))))))
     * -> 0 + (1 + (0 + (0 + (1 + (0 + 0)))))
     * -> 0 + (1 + (0 + (0 + (1 + 0))))
     * -> 0 + (1 + (0 + (0 + 1)))
     * -> 0 + (1 + (0 + 1))
     * -> 0 + (1 + 1)
     * -> 0 + 2
     * -> 2
     */
    public int anzahlLeerzeichen(String s)
    {
        if (s.length() == 0)
        {
            return 0;
        }
        if (s.charAt(0) == (" ").charAt(0))
        {
            return 1 + anzahlLeerzeichen(s.substring(1));
        }
        else
        {
            return anzahlLeerzeichen(s.substring(1));
        }
    }

    /**
     * Liefert die umgedrehte Zeichenkette. Auswertung:
     * 
     *   umgedreht("regal")
     * -> umgedreht("egal") + 'r'
     * -> (umgedreht("gal") + 'e') + 'r'
     * -> ((umgedreht("al") + 'g') + 'e') + 'r'
     * -> (((umgedreht("l") + 'a') + 'g') + 'e') + 'r'
     * -> (((          "l"  + 'a') + 'g') + 'e') + 'r'
     * -> ((           "la"        + 'g') + 'e') + 'r'
     * -> (            "lag"              + 'e') + 'r'
     * ->              "lage"                    + 'r'
     * ->              "lager"
     */
    public String umgedreht(String s)
    {
        switch (s.length())
        {
            case 1:
            return s;
            case 2:
            return "" + s.charAt(1) + s.charAt(0);
        }
        String a;
        a = s.charAt(s.length()-1) + umgedreht(s.substring(1,s.length()-1)) + s.charAt(0);
        return a; 
    }
}
