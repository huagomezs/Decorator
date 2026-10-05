package decorator;

import vehicle.KiaPicanto;

public class Rug extends Decorator {
    private final KiaPicanto kiaPicanto;

    public Rug(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", alfombras";
    }

    @Override
    public long cost() {
        return 92000L + kiaPicanto.cost();
    }
}
