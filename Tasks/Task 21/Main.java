public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        //tv.getTV(1);
        remoteControl.getButtons();
        System.out.println();
        remoteControl.pushButton(4);
        remoteControl.pushButton(0);
        remoteControl.pushButton(0);
    }
}
