package model;

import vehicle.KiaPicanto;

public class ZenithMT extends KiaPicanto {

    public ZenithMT() {
        description = description + " Zenith MT (motor 1.25 L, 83 hp, 122 Nm)";
    }

    @Override
    public long cost() {
        
        return cost + 14990000L;
    }
}
