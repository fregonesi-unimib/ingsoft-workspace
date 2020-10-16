package clock;

public class ClockHoursState extends ClockState {

    public ClockHoursState(Clock clock) {
        super(clock);
    }

    @Override
    public void modeButton() {
        clock.setState(new ClockMinutesState(clock));
    }

    @Override
    public void changeButton() {
        clock.setHours((clock.getHours() + 1) % 24);
    }
}
