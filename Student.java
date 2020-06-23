/**
 * Třída Student  sloužící k vytvoření studenta s hodnotami jméno, třída, rok narození a průměr známek
 */
public class Student
{
    
    private String jmeno;
    private String trida;
    private int rokNarozeni;
    private float prumer;

    /**
     * Parametrický konstruktor načítající jméno, třídu a rok narození
     * @param jmeno Jméno studenta
     * @param trida Třída studenta
     * @param rokNarozeni Rok narození studenta
     */
    public Student(String jmeno, String trida, int rokNarozeni){
        this.jmeno = jmeno;
        this.trida = trida;
        this.rokNarozeni = rokNarozeni;
        this.prumer = 0;
        System.out.println("Do třídy " + trida + " přišel nový student " + jmeno);
    }

    /**
     * Metoda setJmeno pro nastavení jména
     * @param j Jméno studenta
     */
    public void setJmeno(String j){
        jmeno = j;
    }

    /**
     * Metoda getJmeno pro vrácení jména
     * @return Jméno studenta
     */
    public String getJmeno(){
        return jmeno;
    }

    /**
     * Metoda setTrida pro nastavení třídy
     * @param t Třída studenta
     */
    public void setTrida(String t){
        trida = t;
    }

    /**
     * Metoda getTrida pro vrácení třídy
     * @return Třída studenta
     */
    public String getTrida(){
        return trida;
    }

    /**
     * Metoda setRokNarozeni pro nastavení roku narození
     * @param r Rok narození studenta
     */
    public void setRokNarozeni(int r){
        rokNarozeni = r;
    }

    /**
     * Metoda getRokNarozeni pro vrácení roku narození
     * @return Rok narození studenta
     */
    public int getRokNarozeni(){
        return rokNarozeni;
    }

    /**
     * Metoda setPrumer pro nastavení průměru známek
     * @param p Průměr známek studenta
     */
    public void setPrumer(float p){
        prumer = p;
    }

    /**
     * Metoda getPrumer pro vrácení průměru známek
     * @return Průměr známek studenta
     */
    public float getPrumer(){
        return prumer;
    }

    /**
     * Metoda pro výpisu jména, třídy a průměru známek studenta do konzole
     */
    public void studium(){
        System.out.println(jmeno + " je studentem třídy " + trida + " a jeho průměr je " + prumer);
    }

    /**
     * Metoda pro výpis jména, třídy a roku narození studenta do konzole
     */
    public void tisk(){
        System.out.println("Jmeno:\t"+getJmeno()+"\nTřída:\t"+getTrida()+"\nRok narození\t"+getRokNarozeni());
    }

    /**
     * Metoda vracející ve formátu String jméno, třídu, rok narození a průměr studenta
     * @return
     */
    public String toString(){
        return("jmeno = "+getJmeno()+", trida = "+getTrida()+", rok narozeni = "+getRokNarozeni()+", prumer = "+getPrumer());
    }

    /**
     * Metoda main vytvářející dva studenty
     * @param args
     */
    public static void main(String[] args){
        Student Honza = new Student("Honza","1IT",96);
        Student Adam = new Student("Adam","1OT",68);
        
        System.out.println(Honza.toString());
    }
}
