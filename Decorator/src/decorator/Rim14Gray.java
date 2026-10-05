package decorator;

import vehicle.KiaPicanto;

public class Rim14Gray extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Rim14Gray(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", rines de aluminio 14 grises";
    }

    @Override
    public long cost() {
        return 550000L + kiaPicanto.cost();
    }
}
