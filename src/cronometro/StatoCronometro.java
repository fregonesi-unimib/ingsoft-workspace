package cronometro;

public abstract class StatoCronometro {
    protected final Cronometro cronometro;

    public StatoCronometro(Cronometro cronometro) {
        this.cronometro = cronometro;
    }

    public abstract void handleStart();
    public abstract void handleStop();
    public abstract void handleReset();
}
