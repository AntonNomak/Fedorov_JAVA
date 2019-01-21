public class RemoteControl {
    private int[] ButtonNumbers = {0,1,2,3,4};
    private TV tv = new TV();
    public RemoteControl(){
        tv.newChannel("СТС",0);
        tv.newChannel("НТВ",1);
        tv.newChannel("Россия",2);
        tv.newChannel("МТВ",3);
        tv.newChannel("ТНТ",4);
    }
    public void getButtons(){
        for (int i = 0; i < ButtonNumbers.length; i++) {
            System.out.println(i + " " + tv.getChannel(i).getName());
        }
    }
    public void pushButton(int k) {
        tv.getTV(k);
    }
}

