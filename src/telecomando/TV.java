package telecomando;

public class TV {
    private boolean on;
    private int volume;

    public TV() {
        this.on = false;
        this.volume = 10;
    }

    public void power() {
        this.on = !this.on;
        System.out.println("TV is now " + (this.on ? "on" : "off"));
    }

    public void volumeUp() {
        if (this.on) {
            this.volume = Math.min(100, this.volume + 1);
            System.out.println("Volume now is " + this.volume);
        } else {
            System.out.println("You should switch on tv first!");
        }
    }

    public void volumeDown() {
        if (this.on) {
            this.volume = Math.max(0, this.volume - 1);
            System.out.println("Volume now is " + this.volume);
        } else {
            System.out.println("You should switch on tv first!");
        }
    }

    @Override
    public String toString() {
        return "TV[ on = " + this.on + ", volume = " + this.volume +" ]";
    }
}
