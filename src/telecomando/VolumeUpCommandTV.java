package telecomando;

public class VolumeUpCommandTV implements Comando {
    private final TV tv;

    public VolumeUpCommandTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
