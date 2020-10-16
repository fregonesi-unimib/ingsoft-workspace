package clock;

public class ClockMinutesState extends ClockState {

    public ClockMinutesState(Clock clock) {
        super(clock);
    }

    @Override
    public void modeButton() {
        clock.setState(new ClockNormalState(clock));
    }

    @Override
    public void changeButton() {
        clock.setMinutes((clock.getMinutes() + 1) % 60);
    }
}
