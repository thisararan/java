public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light){

        this.light = light;
    }

    @java.lang.Override
    public void execute() {

        light.off();
    }

    @java.lang.Override
    public void undo() {

        light.on();
    }

}
