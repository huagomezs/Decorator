package decorator;

import vehicle.KiaPicanto;

public class Rim14 extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Rim14(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", rines de aluminio 14";
    }

    @Override
    public long cost() {
        return 500000L + kiaPicanto.cost();
    }
}
