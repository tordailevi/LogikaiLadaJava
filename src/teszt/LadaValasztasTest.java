
package teszt;

import modell.LadaModell;
import vezerlo.LadaVezerlo;

public class LadaValasztasTest {
        public static void main(String[] args) {
            tesztLadaVisszajelzes();
            tesztSzovegSzamHelyettEsForditva();
            TesztMindenLadanFelirat();
            TesztNemLetezoLada();
    }
        
        
    public static void tesztLadaVisszajelzes(){
        //Levi
        String eredmenyEzust = LadaVezerlo.valasztottEredmeny("Ezüst");
        assert eredmenyEzust.contains("Gratulálunk") : "HIBA: Helyes válasznál nem gratulál!";
        
        String eredmenyArany = LadaVezerlo.valasztottEredmeny("Arany");
        assert eredmenyArany.equals("Nem nyert, próbáld újra!") : "HIBA: Rossz válasznál nem a megfelelő üzenetet kapjuk!";
        
        String eredmenyBronz = LadaVezerlo.valasztottEredmeny("Bronz");
        assert eredmenyBronz.equals("Nem nyert, próbáld újra!") : "HIBA: Rossz válasznál nem a megfelelő üzenetet kapjuk!";
    }

    public static void tesztSzovegSzamHelyettEsForditva() {
        //Levi
        String eredmeny1 = LadaVezerlo.valasztottEredmeny("2");
        assert eredmeny1.contains("Gratulálunk") : "HIBA: '2' esetén is ezüstöt kéne találni!";

        String eredmeny2 = LadaVezerlo.valasztottEredmeny("Bronz");
        assert eredmeny2.equals("Nem nyert, próbáld újra!") : "HIBA: 'Bronz' esetén rossz eredményt kaptunk!";
    }
    
    public static void TesztMindenLadanFelirat() {
        //Milán
        LadaModell lada1 = new LadaModell("piros", "Nagyon szep");
        LadaModell lada2 = new LadaModell("barna", "szaros lada");
        LadaModell lada3 = new LadaModell();

        assert lada1.getFelirat() != null && !lada1.getFelirat().isEmpty() : "lada1 felirata hiányzik!";
        assert lada2.getFelirat() != null && !lada2.getFelirat().isEmpty() : "lada2 felirata hiányzik!";
        assert lada3.getFelirat() != null && !lada3.getFelirat().isEmpty() : "lada3 felirata hiányzik!";

        System.out.println("1. teszt sikeres: minden láda van felirat.");
    }
    
    
    public static void TesztNemLetezoLada() {
        //Milán
        LadaModell nemLetezoLada = null;

        try {
            assert nemLetezoLada != null : "Nem létező ládára hivatkozott!";
            System.out.println("Hiba: Nem létező ládát tudtam haszználni.");
        } catch (AssertionError e) {
            System.out.println("2. teszt sikeres: nem létező ládára hivatkozás jól kezelve.");
        }

        System.out.println("Minden teszt lefutott.");
    }
}
