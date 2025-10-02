package vezerlo;

import modell.LadaModell;
import nezet.LadaNezet;

public class LadaVezerlo {

    private LadaModell modell;
    private LadaNezet nezet;
           
    
    public LadaVezerlo(LadaModell modell, LadaNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        nezet.setVisible(true);
    }
    
    public void feladat(){
        
    }
}
