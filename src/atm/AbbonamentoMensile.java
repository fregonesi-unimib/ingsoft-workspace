package atm;

public class AbbonamentoMensile extends Abbonamento {
    public AbbonamentoMensile(String nomeProprietario, String cognomeProprietario,
                                  TipoAbbonamento tipoAbbonamento) {
        super(nomeProprietario, cognomeProprietario, tipoAbbonamento, 30, 45.00);
    }

    @Override
    public String durationString() {
        return "mensile";
    }
}
