package decorator;

import vehicle.KiaPicanto;

public class BicycleRack extends Decorator {
    private final KiaPicanto kiaPicanto;

    public BicycleRack(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", portabicicletas";
    }

    @Override
    public long cost() {
        return 910000L + kiaPicanto.cost();
    }
}
