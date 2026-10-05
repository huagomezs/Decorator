package model;

import vehicle.KiaPicanto;

public class GTLineAT extends KiaPicanto {

    public GTLineAT() {
        description = description + " GT Line AT (motor de gasolina 1.25 L, 4 cilindros, 16 valvulas)";
    }

    @Override
    public long cost() {
        
        return cost + 12990000L;
    }
}
