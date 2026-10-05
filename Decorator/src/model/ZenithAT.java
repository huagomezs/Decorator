package model;

import vehicle.KiaPicanto;

public class ZenithAT extends KiaPicanto {

    public ZenithAT() {
        description = description + " Zenith AT (motor de 4 cilindros, equipo completo de seguridad y tecnologia)";
    }

    @Override
    public long cost() {
        
        return cost + 19990000L;
    }
}
