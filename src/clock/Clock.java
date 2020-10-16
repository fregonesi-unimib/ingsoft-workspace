package clock;

public class Clock {
    private ClockState state;
    private int minutes, hours;
    private boolean light;

    // Constructor sets the initial time to 12:00 and state to normal state
    public Clock() {
        setState(new ClockNormalState(this));
        this.minutes = 0;
        this.hours = 12;
        this.light = false;
    }

    // protected setters
    protected void setState(ClockState state) {
        this.state = state;
    }

    protected void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else
            throw new RuntimeException("Minutes must be between 0 and 59");
    }

    protected void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        }
        else
            throw new RuntimeException("Hours must be between 0 and 23");
    }

    protected void setLight(boolean light) {
        this.light = light;
    }

    // public getters
    public String getTimeString() {
        return (hours < 10 ? ("0" + hours) : hours) + ":" +
                (minutes < 10 ? ("0" + minutes) : minutes);
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getHours() {
        return this.hours;
    }

    public boolean isLightOn() {
        return this.light;
    }

    @Override public String toString() {
        return "Clock[time=" + getTimeString() + ", lightOn=" + light + "]";
    }

    // public buttons
    public void pressChangeButton() {
        state.changeButton();
    }

    public void pressModeButton() {
        state.modeButton();
    }
}
