package atm;

public class AbbonamentoGiornaliero extends Abbonamento {
    public AbbonamentoGiornaliero(String nomeProprietario, String cognomeProprietario,
                                  TipoAbbonamento tipoAbbonamento) {
        super(nomeProprietario, cognomeProprietario, tipoAbbonamento, 1, 2.00);
    }

    @Override
    public String durationString() {
        return "giornaliero";
    }
}
