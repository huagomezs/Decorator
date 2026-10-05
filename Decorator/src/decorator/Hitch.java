package decorator;

import vehicle.KiaPicanto;

public class Hitch extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Hitch(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", enganche de carga";
    }

    @Override
    public long cost() {
        return 810000L + kiaPicanto.cost();
    }
}
