package decorator;

import vehicle.KiaPicanto;

public class Sensor extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Sensor(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", sensores de parqueo";
    }

    @Override
    public long cost() {
        return 450000L + kiaPicanto.cost();
    }
}
