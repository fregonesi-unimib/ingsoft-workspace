package telecomando;

public class VolumeDownCommandTV implements Comando {
    private final TV tv;

    public VolumeDownCommandTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}
