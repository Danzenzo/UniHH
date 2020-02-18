
/**
 * Bei dieser Klasse soll ein Klient eine ganze Zahl raten.
 * Die zu eratende Zahl soll beim Erzeugen eines Exemplars übergeben werden.
 * 
 * @author Christoph und Daniel 
 * @version 11.11.2015
 */
class Ratemaschiene
{
    private final int _zahl;
    private int versuchsanzahl = 0;
    private final int _ich;
    

    
    public Ratemaschiene(int ich , int raten )
    {
        _zahl = raten;
        _ich = ich;
    }
    
    /**
     * Rate eine ganze Zahl.
     * @param Zahl in Ziffern.
     * 
     */
    public String pruefeDieseZahl(int zahl)
    {
         versuchsanzahl = versuchsanzahl +1;
        if (zahl== _ich)
        { 
            return "Stimmt! Versuchsanzahl="+ versuchsanzahl;
        }
        else if (zahl<_ich)
        {
            return "Zu niedrig geraten! Versuchsanzahl=" + versuchsanzahl;
        }
        else 
        {
            return "Zu hoch getippt! Versuchsanzahl="+ versuchsanzahl;
        }
    
       
    }

}

