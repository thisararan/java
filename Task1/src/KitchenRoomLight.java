public class KitchenRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness =100;
        System.out.println("Kitchen Room Light is ON at full brightness");
    }

    @java.lang.Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen Room Light is OFF");
    }

    @java.lang.Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen Room Light dimmed to " + brightness + "% brightness");
    }

    public int getBrightness() {
        return brightness;
    }
}
