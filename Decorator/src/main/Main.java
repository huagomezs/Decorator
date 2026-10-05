package main;

import vehicle.KiaPicanto;
import model.GTLineAT;
import model.ZenithAT;
import model.ZenithMT;
import decorator.Rug;
import decorator.Alarms;
import decorator.Rim14;


public class Main{
    public static void main (String args []) {
        KiaPicanto kiaPicanto = new GTLineAT();
        
        System.out.println(kiaPicanto.getDescription()
            + " $ " + kiaPicanto.cost());

        KiaPicanto kiaPicanto2 = new ZenithAT(); 
        kiaPicanto2 = new Rug(kiaPicanto2);
        kiaPicanto2 = new Alarms(kiaPicanto2);
        
        System.out.println(kiaPicanto2.getDescription()
            + " $ " + kiaPicanto2.cost());
        
        
        KiaPicanto kiaPicanto3 = new ZenithMT(); 
        kiaPicanto3 = new Rug(kiaPicanto3);
        kiaPicanto3 = new Rim14(kiaPicanto3);
        
        System.out.println(kiaPicanto3.getDescription()
            + " $ " + kiaPicanto3.cost());
    }
}
