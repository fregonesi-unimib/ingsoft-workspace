package telecomando;

public class TestTelecomando {
    public static void main(String[] args) {
        TV tv = new TV();

        Telecomando telecomandoTv = new Telecomando(
                new PowerCommandTV(tv),
                new VolumeUpCommandTV(tv),
                new VolumeDownCommandTV(tv)
        );

        telecomandoTv.power();

        telecomandoTv.volumeUp();

        telecomandoTv.volumeDown();

        telecomandoTv.power();

        telecomandoTv.volumeDown();

    }
}
