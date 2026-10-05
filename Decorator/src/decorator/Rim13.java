package decorator;

import vehicle.KiaPicanto;

public class Rim13 extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Rim13(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", rines de aluminio 13";
    }

    @Override
    public long cost() {
        return 350000L + kiaPicanto.cost();
    }
}
