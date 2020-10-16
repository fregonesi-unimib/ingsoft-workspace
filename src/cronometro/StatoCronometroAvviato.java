package cronometro;

public class StatoCronometroAvviato extends StatoCronometro {
    public StatoCronometroAvviato(Cronometro cronometro) {
        super(cronometro);
    }

    @Override
    public void handleStart() {
        System.out.println("Il cronometro è già avviato!");
    }

    @Override
    public void handleStop() {
        System.out.println("Cronometro fermato!");
        cronometro.setState(new StatoCronometroFermato(cronometro));
    }

    @Override
    public void handleReset() {
        System.out.println("Il cronometro non può essere resettato prima di essere fermato!");
    }
}
