package model;

import vehicle.KiaPicanto;

public class VibrantMT extends KiaPicanto {

    public VibrantMT() {
        description = description + " Vibrant MT (motor 1.0 L, 66 hp, 95 Nm)";
    }

    @Override
    public long cost() {
        
        return cost + 7990000L;
    }
}
