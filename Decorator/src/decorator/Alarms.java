package decorator;

import vehicle.KiaPicanto;

public class Alarms extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Alarms(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", alarma";
    }

    @Override
    public long cost() {
        return 205000L + kiaPicanto.cost();
    }
}
