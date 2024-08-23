public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new KitchenRoomLight();
        Light livingroomlight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight,50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingroomlight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingroomlight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingroomlight,30);

        remoteControl.setCommand(0,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(1,livingRoomLightOn,livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        kitchenLightDim.execute();
        kitchenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();
    }
}
