package telecomando;

public class Telecomando {
    private final Comando power, volumeUp, volumeDown;

    public Telecomando(Comando power, Comando volumeUp, Comando volumeDown) {
        this.power = power;
        this.volumeUp = volumeUp;
        this.volumeDown = volumeDown;
    }

    public void power() {
        power.execute();
    }

    public void volumeUp() {
        volumeUp.execute();
    }

    public void volumeDown() {
        volumeDown.execute();
    }
}
