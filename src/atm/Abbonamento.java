package atm;

public abstract class Abbonamento {
    private final String nomeProprietario, cognomeProprietario;
    protected double prezzo;
    private final int durata;
    private final TipoAbbonamento tipoAbbonamento;

    public Abbonamento(String nomeProprietario, String cognomeProprietario,
                       TipoAbbonamento tipoAbbonamento, int durata, double prezzo) {
        this.nomeProprietario = nomeProprietario;
        this.cognomeProprietario = cognomeProprietario;
        this.tipoAbbonamento = tipoAbbonamento;
        this.durata = durata;
        this.prezzo = prezzo * tipoAbbonamento.getPriceReduction();
    }

    public abstract String durationString();

    public String getProprietario() {
        return nomeProprietario + " " + cognomeProprietario;
    }

    @Override
    public String toString() {
        return "[ Abbonamento "+ durationString() + " " + tipoAbbonamento.getName() +
                ", intestatario = " + getProprietario() +
                ", prezzo = " + String.format("%.2f", prezzo) + " euro ]";
    }
}
