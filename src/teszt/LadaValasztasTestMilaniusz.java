package teszt;

import modell.LadaModell;

public class LadaValasztasTestMilaniusz {

    public static void main(String[] args) {
    TesztMindenLadanFelirat();
    TesztNemLetezoLada();


    }

    public static void TesztMindenLadanFelirat() {
        LadaModell lada1 = new LadaModell("piros", "Nagyon szep");
        LadaModell lada2 = new LadaModell("barna", "szaros lada");
        LadaModell lada3 = new LadaModell();

        assert lada1.getFelirat() != null && !lada1.getFelirat().isEmpty() : "lada1 felirata hiányzik!";
        assert lada2.getFelirat() != null && !lada2.getFelirat().isEmpty() : "lada2 felirata hiányzik!";
        assert lada3.getFelirat() != null && !lada3.getFelirat().isEmpty() : "lada3 felirata hiányzik!";

        System.out.println("1. teszt sikeres: minden ladna van felirat.");
    }
    
    
    public static void TesztNemLetezoLada() {
        
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
