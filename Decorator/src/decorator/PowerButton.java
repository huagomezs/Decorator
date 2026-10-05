package decorator;

import vehicle.KiaPicanto;

public class PowerButton extends Decorator {
    private final KiaPicanto kiaPicanto;

    public PowerButton(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", botón de encendido";
    }

    @Override
    public long cost() {
        return 900000L + kiaPicanto.cost();
    }
}
