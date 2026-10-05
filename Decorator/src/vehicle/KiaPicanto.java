package vehicle;

public abstract class KiaPicanto {

    protected String description = "Kia Picanto 2026";
    protected long cost = 50000000L;

    public String getDescription() {
        return description;
    }

    public abstract long cost();
}
