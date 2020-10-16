package cronometro;

public class StatoCronometroDefault extends StatoCronometro {
    public StatoCronometroDefault(Cronometro cronometro) {
        super(cronometro);
    }

    @Override
    public void handleStart() {
        System.out.println("Cronometro avviato");
        cronometro.setState(new StatoCronometroAvviato(cronometro));
    }

    @Override
    public void handleStop() {
        System.out.println("Il cronometro non può essere fermato prima di essere avviato!");
    }

    @Override
    public void handleReset() {
        System.out.println("Il cronometro è già stato resettato!");
    }
}
