public class LightDimCommand implements Command{
    private Light light;
    private int prevBrightness;
    private int newBrightness;

    public LightDimCommand(Light light, int brightness){
        this.light = light;
        this.newBrightness= brightness;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness();
        light.dim(newBrightness);
    }

    @java.lang.Override
    public void undo() {

        light.dim(prevBrightness);
    }
}
