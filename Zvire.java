/**
 * Třída sloužící k vytvoření zvířete a obsahující hodnoty druh, stáří a váha
 */
public class Zvire
{
    private String druh;
    private int stari;
    private double vaha;

    /**
     * Kontruktor třídy, načte druh, stáří a váhu zvířete
     * @param druh Druh zvířete
     * @param stari Stáří zvířete
     * @param vaha Váha zvířete
     */
    public Zvire(String druh, int stari, double vaha){
        this.druh = druh;
        this.stari = stari;
        this.vaha = vaha;
    }
    
    public Zvire(String druh, double vaha){
        this.druh = druh;
        this.vaha = vaha;
        stari = 1;
    }

    /**
     * Metody set pro uložení hodnot
     */
    public void setDruh(String druh){
        this.druh = druh;
    }
    
    public void setStari(int stari){
        this.stari = stari;
    }
    
    public void setVaha(double vaha){
        this.vaha = vaha;
    }

    /**
     * Metody get pro vrácení hodnot
     */
    public String getDruh(){
        return druh;
    }
    
    public int getStari(){
        return stari;
    }
    
    public double getVaha(){
        return vaha;
    }

    /**
     * Metoda tisk sloužící pro vypsání uložených hodnot
     */
    public void tisk(){
        System.out.println("Druh:\t"+druh+"\nStáří:\t"+stari+"\nVaha\t"+vaha);
    }

    /**
     * Metoda sloužící k vrácí hodnot ve formátu String
     * @return String s popisy
     */
    public String toString(){
        return("druh = "+getDruh()+", stari = "+getStari()+", vaha = "+getVaha());
    }
}
