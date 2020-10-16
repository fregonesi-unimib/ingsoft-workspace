package cronometro;

public class StatoCronometroFermato extends StatoCronometro {
    public StatoCronometroFermato(Cronometro cronometro) {
        super(cronometro);
    }

    @Override
    public void handleStart() {
        System.out.println("Il cronometro deve essere resettato prima di essere avviato!");
    }

    @Override
    public void handleStop() {
        System.out.println("Il cronometro è già stato fermato!");
    }

    @Override
    public void handleReset() {
        cronometro.setState(new StatoCronometroDefault(cronometro));
        System.out.println("Cronometro resettato!");
    }
}
