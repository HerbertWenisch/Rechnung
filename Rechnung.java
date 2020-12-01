public class Rechnung {
    private int nr;
    private String adressat;
    
    private BestellPos pos1;
    private BestellPos pos2;
    
    public Rechnung(){
        nr = 234;
        adressat = "Heiner Müller";
        pos1 = new BestellPos(new Artikel("Seife", 1.56f), 5);
        pos2 = new BestellPos(new Artikel("Putzlappen", 3.45f), 2);
    }   
    
    public float getBetrag(){
        return pos1.getBetrag() + pos2.getBetrag();
    }
    
}
