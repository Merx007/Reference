/**
 * Třída Valec sloužící k výpočtu povrchu a objemu válce za použití metod z třídy Kruh
 */

public class Valec extends Kruh
{
    public double vyska;
    double objemValce;
    /**
     * Parametrická konstruktor pro vytvoření Valec
     */
    public Valec(double polomer,double vyska){
        super(polomer);     //posílá hodnoty do konstruktoru v Kruh
        this.vyska = vyska;
        this.objemValce(polomer,vyska);
    }
    
    /**
     * Bezparametrický konstruktor pro vytvoření Valec
     */
    public Valec(){
        this(10,15);
    }
    
    /**
     * Metoda pro výpočet povrchu válce, s použitím metod z Kruh
     */
    public double povrchValce(double polomer,double vyska){
        return(2*obsahKruhu(polomer)+obvodKruhu(polomer)*vyska);
    }
    
    /**
     * Metoda pro výpočet objemu válce, s použitím metod z Kruh
     */
    public double objemValce(double polomer,double vyska){
        return objemValce = (obsahKruhu(polomer)*vyska);
    }
    
    /**
     * Překrytá metoda info
     */
    public void info(){
        System.out.println("Objem válce: " + objemValce + " jednotek krychlových");
    }
}
