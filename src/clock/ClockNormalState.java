package clock;

public class ClockNormalState extends ClockState {
    public ClockNormalState(Clock clock) {
        super(clock);
    }

    @Override
    public void modeButton() {
        clock.setState(new ClockHoursState(clock));
    }

    @Override
    public void changeButton() {
        clock.setLight(!clock.isLightOn());
    }
}
