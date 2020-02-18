/**
 * SWBild ist eine Klasse, die Graustufenbilder repraesentiert und
 * manipuliert. Die Implementierung erfolgt durch ein einfaches
 * Bildformat: Die Bildpunkte werden in einem zweidimensionalen
 * Array von 'short'-Werten gehalten. Jeder Feldeintrag kann einen
 * Wert zwischen 0 und 255 annehmen. Andere Werte sind unzulaessig.
 * Der Wertebereich [0..255] repraesentiert den Graustufenbereich:
 * 0 fuer Schwarz, 255 fuer Weiss und dazwischenliegende Werte fuer
 * die Grauabstufungen.
 * 
 * Beispielmethode 'dunkler': Ein geladenes Bild kann um
 * ein gegebenes 'delta' abgedunkelt werden.
 * 
 * @author  Daniel
 */
class SWBild
{
    // die Bilddaten dieses Bildes
    private short[][] _bilddaten;

    // die Breite dieses Bildes
    private int _breite;

    // die Hoehe dieses Bildes
    private int _hoehe;

    // Leinwand zur Anzeige
    private Leinwand _leinwand;

    /**
     * Initialisiert ein Bild mit einer Bilddatei. Der Benutzer kann interaktiv mit Hilfe eines
     * Dateidialogs die zu ladende Datei auswaehlen.
     */
    public SWBild()
    {
        _bilddaten = BildEinleser.liesBilddaten();
        if (_bilddaten != null)
        {
            aktualisiereBildgroesse(_bilddaten);
            erzeugeLeinwand();
        }
    }

    /**
     * Initialisiert ein Bild mit einer Bilddatei. Der Dateiname kann als absoluter oder relativer
     * Pfad uebergeben werden.
     * 
     * @param bilddateiName
     *            der Name der Bilddatei
     */
    public SWBild(String bilddateiName)
    {
        _bilddaten = BildEinleser.liesBilddaten(bilddateiName);
        aktualisiereBildgroesse(_bilddaten);
        erzeugeLeinwand();
    }

    /**
     * Dieses Bild um einen Wert abdunkeln. 
     * 
     * @param delta
     *            Wert der Abdunkelung. Es wird mit dem Betrag von delta gerechnet, 
     *            deshalb darf der Parameter sowohl positiv als auch negativ sein.  
     */
    public void dunkler(int delta)
    {
        if (delta < 0)
        {
            delta = -delta;
        }

        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                if ((_bilddaten[y][x] - delta) > 0) // Wert darf 0 nicht unterschreiten
                {
                    _bilddaten[y][x] = (short) (_bilddaten[y][x] - delta);
                }
                else
                {
                    _bilddaten[y][x] = 0;
                }
            }
        }

        zeichneBild();
    }

    /**
     * Dieses Bild um einen Wert aufhellen.
     * 
     * @param delta
     *            Wert der Aufhellung. Es wird mit dem Betrag von delta gerechnet, 
     *            deshalb darf der Parameter sowohl positiv als auch negativ sein.  
     */
    public void heller(int delta)
    {
        if (delta < 0)
        {
            delta = -delta;
        }

        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                if ((_bilddaten[y][x] + delta) <= 255) // Wert darf 255 nicht ueberschreiten
                {
                    _bilddaten[y][x] = (short) (_bilddaten[y][x] + delta);
                }
                else
                {
                    _bilddaten[y][x] = 255;
                }
            }
        }

        zeichneBild();
    }

    /**
     * Dieses Bild invertieren.
     */
    public void invertieren()
    {
        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                _bilddaten[y][x] = (short) (255 - _bilddaten[y][x]);
            }
        }

        zeichneBild();
    }

    /**
     * Dieses Bild vertikal spiegeln.
     */
    public void vertikalSpiegeln()
    {
        for (int y = 0; y <= _hoehe / 2 - 1; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                short tmp = _bilddaten[y][x];
                _bilddaten[y][x] = _bilddaten[_hoehe - y - 1][x];
                _bilddaten[_hoehe - y - 1][x] = tmp;
            }
        }

        zeichneBild();
    }

    /**
     * Dieses Bild horizontal spiegeln.
     */
    public void horizontalSpiegeln()
    {
        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x <= _breite / 2 - 1; x++)
            {
                short tmp = _bilddaten[y][x];
                _bilddaten[y][x] = _bilddaten[y][_breite - x - 1];
                _bilddaten[y][_breite - x - 1] = tmp;
            }
        }

        zeichneBild();
    }
    
    /**
     * Dieses Bild weichzeichnen.
     */
    public void weichzeichnen()
    {
        for (int y = 0; y < _hoehe ; y++)
        {
            for (int x = 0; x < _breite; x++)
            {

                _bilddaten[y][x] = mittelWertBerechnen(y, x);
            }
        }

        zeichneBild();
    }

    /**
     * Den Mittelwert von den umgebenden Punkten
     */
    private short mittelWertBerechnen(int y, int x)
    {
        int summe = 0;
        int count = 0;
        if (y - 1 >= 0)
        {
            if (x - 1 >= 0)
            {
                summe += _bilddaten[y-1][x-1];
                ++count;
            }
            summe += _bilddaten[y-1][x];
            ++count;
            if (x + 1 < _breite)
            {
                summe += _bilddaten[y-1][x+1];
                ++count;
            }
        }

        if (x - 1 >= 0)
        {
            summe += _bilddaten[y][x-1];
            ++count;
        }

        if (x + 1 < _breite)
        {
            summe += _bilddaten[y][x+1];
            ++count;
        }

        if (y + 1 < _hoehe)
        {
            if (x - 1 >= 0)
            {
                summe += _bilddaten[y+1][x-1];
                ++count;
            }
            summe += _bilddaten[y+1][x];
            ++count;
            if (x + 1 < _breite)
            {
                summe += _bilddaten[y+1][x+1];
                ++count;
            }
        }
        
        return (short) ( summe / count );
    }

    /**
     * Dieses Bild am Mittelpunkt spiegeln.
     */
    public void punktSpiegeln()
    {
        vertikalSpiegeln();
        horizontalSpiegeln();
    }

    /**
     * Erzeuge bei diesem Bild einen Spot mit Radius r, Mittelpunkt x0,y0 und
     * Beleuchtungsintensitaet i. Ausserhalb von r nimmt die Ausleuchtung linear ab.
     * Wie im wirklichem Leben...
     * 
     * @param xo
     *            x-Koordinate des Mittelpunktes
     * @param yo
     *            y-Koordinate des Mittelpunktes
     * @param r
     *            Radius
     * @param i
     *            Beleuchtungsintesitaet
     */
    public void spot(int x0, int y0, int r, short i)
    {
        // HIER FEHLT NOCH WAS
    }

    /**
     * Gib den Wert eines einzelnen Bildpunktes zurueck.
     * 
     * @param y
     *            die y-Koordinate des Bildpunktes.
     * @param x
     *            die x-Koordinate des Bildpunktes.
     * @return den Wert des angegebenen Bildpunktes.
     */
    public short gibBildpunkt(int y, int x)
    {
        return _bilddaten[y][x];
    }

    // ==== private Hilfsmethoden ====

    /**
     * Zeichnet das Bild in _bilddaten neu
     */
    private void zeichneBild()
    {
        _leinwand.zeichneBild(_bilddaten);
    }

    /**
     * Hoehe und Breite neu berechnen, nachdem die Bilddaten veraendert worden sind.
     */
    private void aktualisiereBildgroesse(short[][] bilddaten)
    {
        _hoehe = bilddaten.length;
        if (_hoehe == 0)
        {
            _breite = 0;
        }
        else
        {
            _breite = bilddaten[0].length;
        }
    }

    /**
     * Erzeuge die Leinwand zur Darstellung und zeige sie an.
     */
    private void erzeugeLeinwand()
    {
        _leinwand = new Leinwand("Bildbetrachter", _breite, _hoehe);
        _leinwand.sichtbarMachen();

        zeichneBild();
    }
}
