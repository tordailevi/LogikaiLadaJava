package teszt;

import modell.LadaModell;
import nezet.LadaNezet;
import vezerlo.LadaVezerlo;

public class LadaValasztasTest {
    
    
    private static LadaVezerlo ladaVezerlo;
    
        public void main(String[] args) {
            
            
            tesztHelyesValasztas();
            tesztAranyValasztas();
            tesztBronzValasztas();
            tesztSzovegVsSzam();
            TesztMindenLadanFelirat();
            TesztNemLetezoLada();
    }
        
    public static void tesztHelyesValasztas() {
        //Levi
        String eredmeny = LadaVezerlo.valasztottEredmeny("Ezüst");
        assert eredmeny.contains("Gratulálunk") : "HIBA: Helyes válasznál nem kaptunk gratulációt!";
    }

    public static void tesztAranyValasztas() {
        //Levi
        String eredmeny = LadaVezerlo.valasztottEredmeny("Arany");
        assert eredmeny.equals("Nem nyert, próbáld újra!") 
            : "HIBA: Rossz válasznál nem a megfelelő üzenetet kaptuk!";
    }
    
    public static void tesztBronzValasztas() {
        //Levi
        String eredmeny = LadaVezerlo.valasztottEredmeny("Bronz");
        assert eredmeny.equals("Nem nyert, próbáld újra!") 
            : "HIBA: Rossz válasznál nem a megfelelő üzenetet kaptuk!";
    }

    public static void tesztSzovegVsSzam() {
        //Levi
        String eredmeny1 = LadaVezerlo.valasztottEredmeny("2");
        assert eredmeny1.contains("Gratulálunk") : "HIBA: '2' esetén is ezüstöt kéne találni!";

        String eredmeny2 = LadaVezerlo.valasztottEredmeny("Bronz");
        assert eredmeny2.contains("Sajnos") : "HIBA: 'Bronz' esetén rossz eredményt kaptunk!";
    }
    
    public static void TesztMindenLadanFelirat() {
        //Milán
        LadaModell lada1 = LadaVezerlo.getModell1();
        LadaModell lada2 = LadaVezerlo.getModell2();
        LadaModell lada3 = LadaVezerlo.getModell3();
        
        

        assert lada1.getFelirat() != null && !lada1.getFelirat().isEmpty() : "lada1 felirata hiányzik!";
        assert lada2.getFelirat() != null && !lada2.getFelirat().isEmpty() : "lada2 felirata hiányzik!";
        assert lada3.getFelirat() != null && !lada3.getFelirat().isEmpty() : "lada3 felirata hiányzik!";

        System.out.println("1. teszt sikeres: minden lada van felirat.");
    }
    
    
    public static void TesztNemLetezoLada() {
        //Milán
        LadaModell nemLetezoLada = null;

        try {
            assert nemLetezoLada != null : "Nem letezo ladara hivatkozko!";
            System.out.println("Hiba: nem letezo ládát tudtam hasznalni.");
        } catch (AssertionError e) {
            System.out.println("2. teszt sikeres: nem letezo ladara hivatkozás jol kezelvre.");
        }

        System.out.println("Minden teszt lefutott.");
    }
}
