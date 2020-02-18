
/**
 * Eine Klasse die eine Waage implementiert.
 * 
 * @author Daniel , Ronja
 * @version 18.11.2015
 */
class Waage
{
    int _letztesGewicht;
    int _trend;
    int minimalGewicht;
    int maximalGewicht;
    int durchschnittsgewicht;
    /**
     * Erzeuge eine Waage.
     * @param körperGewicht Das Körpergewicht in Gramm.
     */
    public Waage(int körperGewicht)
    {
        _letztesGewicht = körperGewicht;
        maximalGewicht = körperGewicht;
        minimalGewicht = körperGewicht;
    }

    /**
     * Gebe ein neues Gewicht ein.
     * @param neuesGewicht das neue angegebene Gewicht in Gramm.
     */
   /*  public void registriere (int neuesGewicht)
    {
        if (_letztesGewicht > neuesGewicht)
        {
            _trend =-1;
        }
        if (_letztesGewicht < neuesGewicht)
        {
            _trend=1;
        }
        else
        {
            _trend=0;
        }
        if (neuesGewicht > maximalGewicht)
        {
            maximalGewicht = neuesGewicht;
        }
        if (neuesGewicht < minimalGewicht)
        {
            minimalGewicht = neuesGewicht;
        }
        _letztesGewicht = neuesGewicht;
    }

    /**
     * Gebe den Trend des Gewichts an.
     */
    public int gibTrend()
    {
        return _trend;
    }
    
    /**
     * gebe das aktuelle Minimalgewicht an.
     */
    public int gibMinimalGewicht()
    {
        return minimalGewicht;  
    }
    
    /**
     * Gebe das aktuelle Maximalgewicht an.
     */
    public int gibMaximalGewicht()
    {
        return maximalGewicht;
    }
    public void registriere(int neuesGewicht)
    {
        if (neuesGewicht < _letztesGewicht)
        {
            _trend = -1; 
        }
        else if (neuesGewicht > _letztesGewicht)
        {
            _trend = +1;
        }
        else
        {
            _trend = 0;
        }
        _letztesGewicht = neuesGewicht;
    }
}

