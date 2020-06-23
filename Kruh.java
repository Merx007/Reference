/**
 * Třída Kruh sloužící k výpočtu obvodu a obsahu kruhu
 */
public class Kruh
{
    double r;
    static double obsah;
    double obvodKruhu;
    double obsahKruhu;
    static double obvod;

    /**
     * Parametrickýá konstruktor Kruhu načítající double poloměr
     */
    public Kruh(double r){
        this.r = r;
        //this.obvod = 2*Math.PI*r;
        this.obvodKruhu = obvodKruhu(r);
        this.obsahKruhu = obsahKruhu(r);
    }
    
    /**
     * Bezparametrický konstruktor Kruh s přednastavením:
     * poloměr = 10;
     * Číslo 10 se přenese do konstruktoru nad
     */
    public Kruh(){
        this(10);  
    }
    
    /**
     * Statická metoda na základě zadaného poloměru vypíše hodnotu obvodu kruhu
     */
    public static double obvod(double r)
    {
        obvod = 2*Math.PI*r;
        return (obvod);
    }
    
    /**
     * Metoda pro zavolání obvodu kruhu z konstruktoru
     */
    public double obvodKruhu(double r)
    {
        return (2*Math.PI*r);
    }
    
    /**
     * Metoda pro zavolání obsahu kruhu z konstruktoru
     */
    public double obsahKruhu(double r)
    {
        return (Math.PI*r*r);
    }
    
    /**
     * Metoda na základě zadaného poloměru vypíše hodnotu obsahu kruhu
     */
    public void obsah(double r)
    {
        this.r = r;
        this.obsah = Math.PI*r*r;
    }

    /**
     * Metoda setPolomer pro nastavení poloměru r
     * @param r poloměr
     */
    public void setPolomer(double r){
        this.r = r;
    }

    /**
     * Metoda getPolomer pro vrácí poloměru r
     * @return r poloměr
     */
    public double getPolomer(){
        return r;
    }

    /**
     * Metoda setObsah pro nastavení obsahu kruhu
     * @param obsah Obsah kruhu
     */
    public void setObsah(double obsah){
        this.obsahKruhu = obsah;
    }

    /**
     * Metoda getObsah pro vrácení obsahu kruhu
     * @return Obsah kruhu
     */
    public double getObsah(){
        return obsah;
    }

    /**
     * Metoda setObvod pro nastavení obvodu kruhu
     * @param obvod Obvod kruhu
     */
    public void setObvod(double obvod){
        this.obvodKruhu = obvod;
    }

    /**
     * Metoda getObvod pro vrácení obvodu kruhu
     * @return
     */
    public double getObvod(){
        return obvod;
    }

    /**
     * Metoda sloužící k přehlednému výpisu všech informací do konzole
     */
    public void info(){
        System.out.println("Vytvořil jsem objekt kruh "+ this.getClass().getName() +
                           "\n\ts poloměrem kruhu:\t" + r + " jednotek" +
                           "\n\ts obvodem kruhu:\t" + obvodKruhu +
                           "\n\ts obsahem kruhu:\t" + obsahKruhu);
    }
}
