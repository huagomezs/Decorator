package decorator;

import vehicle.KiaPicanto;

public class SafetyBolt extends Decorator {
    private final KiaPicanto kiaPicanto;

    public SafetyBolt(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    @Override
    public String getDescription() {
        return kiaPicanto.getDescription() + ", tuercas de seguridad";
    }

    @Override
    public long cost() {
        return 156100L + kiaPicanto.cost();
    }
}
