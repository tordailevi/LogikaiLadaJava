package modell;


public class LadaModell {
    
    
    private String szin;
    private String felirat;

    public LadaModell(String szin, String felirat) {
        setFelirat(felirat);
        setSzin(szin);
    }

    public LadaModell() {
        this("Nincs szín", "Nincs felirat");
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String ujSzin) {
        this.szin = ujSzin;
    }

    public String getFelirat() {
        return felirat;
    }

    public void setFelirat(String ujFelirat) {
        this.felirat = ujFelirat;
    }
    
    
    
    
    
    
}
