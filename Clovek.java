/**
 * Třída Clovek sloužící k vytvoření člověka s hodnotami jméno, plat, věk a bydliště
 */
public class Clovek
{
    private String jmeno;
    private int plat;
    private int vek;
    private String bydliste;

    /**
     * Konstruktor třídy, načte jméno, plat, věk a bydliště
     * @param jmeno Jméno člověka
     * @param plat Plat člověka
     * @param vek Věk člověka
     * @param bydliste Bydliště člověka
     */
    public Clovek(String jmeno, int plat, int vek, String bydliste){
        this.jmeno = jmeno;
        this.plat = plat;
        this.vek = vek;
        this.bydliste = bydliste;
    }

    /**
     * Metoda setJmeno sloužící k nastavení jména
     * @param jmeno Jméno člověka
     */
    public void setJmeno(String jmeno){
        this.jmeno = jmeno;
    }

    /**
     * Metoda setPlat sloužící k nastavení platu
     * @param plat Plat člověka
     */
    public void setPlat(int plat){
        this.plat = plat;
    }

    /**
     * Metoda setVek sloužící k nastavení věku
     * @param vek Věk člověka
     */
    public void setVek(int vek){
        this.vek = vek;
    }

    /**
     * Metoda setBydliste sloužící k nastavení bydliště
     * @param bydliste Bydliště člověka
     */
    public void setBydliste(String bydliste){
        this.bydliste = bydliste;
    }

    /**
     * Metoda getJmeno sloužící k vrácení jména
     * @return Jméno
     */
    public String getJmeno(){
        return jmeno;
    }

    /**
     * Metoda getPlat sloužící k vrácení platu
     * @return Plat
     */
    public int getPlat(){
        return plat;
    }

    /**
     * Metoda getVek sloužící k vrácení věku
     * @return Věk
     */
    public int getVek(){
        return vek;
    }

    /**
     * Metoda getBydliste sloužící k vrácení věku
     * @return
     */
    public String getBydliste(){
        return bydliste;
    }
    }
