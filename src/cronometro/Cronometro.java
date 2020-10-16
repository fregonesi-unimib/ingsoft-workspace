package cronometro;

public class Cronometro {
    private StatoCronometro state;

    public Cronometro() {
        state = new StatoCronometroDefault(this);
    }

    public void pressStartButton() {
        state.handleStart();
    }

    public void pressStopButton() {
        state.handleStop();
    }

    public void pressResetButton() {
        state.handleReset();
    }

    protected void setState(StatoCronometro state) {
        this.state = state;
    }
}
