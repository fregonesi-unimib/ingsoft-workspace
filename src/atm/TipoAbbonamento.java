package atm;

public enum TipoAbbonamento {
    ORDINARIO("Ordinario", 1),
    RIDOTTO("Ridotto", 0.8),
    OVER65("Over65", 0);

    private final String name;
    private final double priceReduction;

    TipoAbbonamento(String name, double priceReduction) {
        this.name = name;
        this.priceReduction = priceReduction;
    }

    public String getName() {
        return name;
    }

    public double getPriceReduction() {
        return priceReduction;
    }
}
