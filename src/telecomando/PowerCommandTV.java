package telecomando;

public class PowerCommandTV implements Comando {
    private final TV tv;

    public PowerCommandTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.power();
    }
}
