package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import modell.LadaModell;
import nezet.LadaNezet;

public class LadaVezerlo {

    private LadaModell modell;
    private LadaModell modell1;
    private LadaModell modell2;
    private LadaModell modell3;
    private LadaNezet nezet;
    
    
    public LadaVezerlo(LadaModell modell, LadaNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        modell1 = new LadaModell("Arany", "Én rejtem a kincset!");
        modell2 = new LadaModell("Ezüst", "Nem én rejtem a kincset!");
        modell3 = new LadaModell("Arany", "Az arany láda hazudik!");
        
        
        
        JOptionPane.showMessageDialog(null, "Van 3 láda!\nArany, Ezüst, Bronz\nAz arany láda azt állítja, hogy 'Én rejtem a kincset!'\nAz ezüst láda azt állítja, hogy 'Nem én rejtem a kincset!'\n"
                + "A bronz láda azt állítja, hogy 'Az arany láda hazudik!'\nViszont csak az egyik láda mond igazat!", "Játék lényege",1);
        nezet.setVisible(true);
    }

    public static String valasztottEredmeny(String valasztott) {
        if ("Ezüst".equalsIgnoreCase(valasztott) || "2".equals(valasztott)) {
            return "Gratulálunk, megtaláltad a kincset az ezüst ládában!";
        } else if ("Arany".equalsIgnoreCase(valasztott) || "1".equals(valasztott) ||
                   "Bronz".equalsIgnoreCase(valasztott) || "3".equals(valasztott)) {
            return "Nem nyert, próbáld újra!";
        } else {
            return "Érvénytelen választás!";
        }
    }


    
    public void feladat(){

    nezet.getjButton1().addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    if (nezet.getjRadioButton2().isSelected()) {
        JOptionPane.showMessageDialog(null, "Helyes válasz!", "Eredmény",2);
    } else if (nezet.getjRadioButton1().isSelected() || nezet.getjRadioButton3().isSelected()) {
    JOptionPane.showMessageDialog(null, "Rossz megoldás!", "Eredmény", JOptionPane.ERROR_MESSAGE);
    } else {
    JOptionPane.showMessageDialog(null, "Válassz egy lehetőséget!", "Figyelmeztetés", JOptionPane.WARNING_MESSAGE);
}
}
});
    }
    
    public LadaModell getModell1() {
        return modell1; 
    }
    public LadaModell getModell2() {
        return modell2; 
    }
    public LadaModell getModell3() {
        return modell3; 
    }
    }
    


