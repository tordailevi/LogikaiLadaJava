package vezerlo;

import javax.swing.JOptionPane;
import modell.LadaModell;
import nezet.LadaNezet;

public class LadaVezerlo {

    private LadaModell modell;
    private LadaNezet nezet;
           
    
    public LadaVezerlo(LadaModell modell, LadaNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        JOptionPane.showMessageDialog(null, "Van 3 láda!\nArany, Ezüst, Bronz\nAz arany láda azt állítja, hogy 'Én rejtem a kincset!'\nAz ezüst láda azt állítja, hogy 'Nem én rejtem a kincset!'\n"
                + "A bronz láda azt állítja, hogy 'Az arany láda hazudik!'\nViszont csak az egyik láda mond igazat!", "Játék lényege",1);
        nezet.setVisible(true);
    }
    
    public void feladat(){
        
    }
}
