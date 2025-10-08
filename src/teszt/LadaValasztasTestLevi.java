package teszt;

import vezerlo.LadaVezerlo;

public class LadaValasztasTestLevi {

    public static void main(String[] args) {
        assert LadaVezerlo.valasztottEredmeny("Ezüst").equals("Gratulálunk, megtaláltad a kincset az ezüst ládában!") 
            : "HIBA: Helyes válaszra nem megfelelő visszajelzés!";
        
        assert LadaVezerlo.valasztottEredmeny("Bronz").equals("Sajnos nem nyert, próbáld újra!") 
            : "HIBA: Rossz választásra nem megfelelő visszajelzés!";

        assert LadaVezerlo.valasztottEredmeny("2").equals("Gratulálunk, megtaláltad a kincset az ezüst ládában!") 
            : "HIBA: Számos választás nem ugyanazt eredményezte, mint szöveges!";

        System.out.println("Minden teszt lefutott!");
    }
}

