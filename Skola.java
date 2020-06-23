/**
 * Třída Skola sloužící k vytvoření studenta pomocí kontruktoru v třídě Student
 */
public class Skola
{
    public static void main(String[] args)
    {
        Student prvni = new Student("Jarda Novák","V2.A",1995);
        
        /*prvni.setJmeno();
        prvni.setTrida();
        prvni.setRokNarozeni();
        prvni.setPrumer();*/
        
        prvni.studium();
        

    }
}
