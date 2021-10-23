public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator)
    {
        // TODO: Setzen Sie die Attribute entsprechend
        // set variables in constructor
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public double toDecimal()
    {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        //Return double value
        return ((double) numerator)/denominator;
    }

    public String print()
    {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return numerator + "/" + denominator;
    }

    public Bruch multiplicate(Bruch b2)
    {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */

        //return new Bruch, after multiplying it with the Bruch variable of the parameter list
        return new Bruch(numerator * b2.getNumerator(), denominator * b2.getDenominator());
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3)
    {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
        //return new Bruch, after multiplying it with the Bruch variables of the parameter list
        return new Bruch(numerator * b2.getNumerator() * b3.getNumerator(),
                       denominator * b2.getDenominator() * b3.getDenominator());
    }
}
