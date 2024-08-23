public class LivingRoomLight implements Light {
    private int brigthness;


    public void on() {
        brigthness =100;
        System.out.println("Living Room Light is ON at full brightness");
    }


    public void off() {
        brigthness =0;
        System.out.println("Living Room Light is OFF");
    }

    @Override
    public void dim(int level) {
        brigthness = level;
        System.out.println("Living Room Light dimmed to " + brigthness+"% brightness");
    }

    @Override
    public int getBrightness() {
        return brigthness;
    }


}
