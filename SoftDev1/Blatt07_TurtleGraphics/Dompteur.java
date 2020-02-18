/**
 * Exemplare dieser Klasse veranlassen Turtles dazu,
 * Spuren auf einer Zeichenflaeche zu hinterlassen.
 *
 * @author Daniel
 */
class Dompteur
{
    /**
     * 'SE1' auf die Zeichenflaeche zeichnen.
     */
    public void start()
    {
        // Neue Turtle an Position (50, 100) erzeugen.
        Turtle turtle = new Turtle(50, 100);

        // 'S' zeichnen:
        turtle.geheVor(30);
        turtle.drehe(-90);
        turtle.geheVor(30);
        turtle.drehe(-90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);

        // Ohne Spur zum naechsten Buchstaben bewegen:
        turtle.hinterlasseKeineSpur();
        turtle.geheZu(130, 100);

        // 'E' zeichnen:
        turtle.hinterlasseSpur();
        turtle.drehe(-180);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(-180);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);

        // Ohne Spur zum naechsten Buchstaben bewegen:
        turtle.hinterlasseKeineSpur();
        turtle.geheZu(180, 100);

        // '1' zeichnen:
        turtle.hinterlasseSpur();
        turtle.setzeFarbe("rot");
        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(-120);
        turtle.geheVor(20);
    }

  
    public void zeichneNEck2(int ecken, String farbe, double x, double y, int laenge)
    {
        Turtle turtle = new Turtle( x,  y);
        turtle.setzeFarbe(farbe);
        for(int i=0;i<ecken;i++)
        {
            turtle.drehe(180 - (((ecken - 2) * 180.0)/ecken));
            turtle.geheVor(laenge);
        }   
    }
}
