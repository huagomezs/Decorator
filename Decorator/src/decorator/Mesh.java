package decorator;

import vehicle.KiaPicanto;

public class Mesh extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Mesh(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", malla";
    }

    @Override
    public long cost() {
        return 110000L + kiaPicanto.cost();
    }
}
