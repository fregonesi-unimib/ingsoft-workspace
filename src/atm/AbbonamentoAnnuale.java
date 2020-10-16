package atm;

public class AbbonamentoAnnuale extends Abbonamento {
    public AbbonamentoAnnuale(String nomeProprietario, String cognomeProprietario,
                                  TipoAbbonamento tipoAbbonamento) {
        super(nomeProprietario, cognomeProprietario, tipoAbbonamento, 365, 400);
    }

    @Override
    public String durationString() {
        return "annuale";
    }
}
