package main;

import modell.LadaModell;
import nezet.LadaNezet;
import vezerlo.LadaVezerlo;

public class Program {
    
    
    public Program() {       
        LadaModell modell = new LadaModell();       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LadaNezet nezet = new LadaNezet();
                LadaVezerlo vezerlo = new LadaVezerlo(modell, nezet);
                vezerlo.feladat();
            }
        });      
    }

    public static void main(String[] args) {   
        new Program();       
    }
    
}
