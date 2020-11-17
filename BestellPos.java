public class BestellPos {
    private Artikel artikel;
    private int anzahl;
    
    public BestellPos(Artikel artikel, int anzahl){
        this.artikel = artikel;
        this.anzahl = anzahl;
    }
    
    public float getBetrag(){
        return artikel.getPreis() * anzahl;
    }
}
