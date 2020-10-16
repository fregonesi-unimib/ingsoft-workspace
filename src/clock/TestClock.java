package clock;

public class TestClock {
    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock);

        clock.pressChangeButton();
        System.out.println(clock);
        clock.pressChangeButton();
        System.out.println(clock);

        clock.pressModeButton();

        clock.pressChangeButton();
        System.out.println(clock);

        clock.pressModeButton();

        clock.pressChangeButton();
        System.out.println(clock);

        clock.pressModeButton();

        clock.pressChangeButton();
        System.out.println(clock);


    }
}
