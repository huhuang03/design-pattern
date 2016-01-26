public class RemoteControlTest {
    public static void main (String [] args)
    {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();    
    }
}
