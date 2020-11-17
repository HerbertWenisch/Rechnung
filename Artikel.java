
public class Artikel {
    private String bezeichnung;
    private float preis;
    
    public Artikel (String bezeichnung, float preis){
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
    
    public String getBezeichnung(){
        return bezeichnung;
    }
    
    public float getPreis(){
        return preis;
    }
}
