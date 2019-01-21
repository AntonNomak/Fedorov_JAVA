import java.util.Random;

public class TV {
    final int MAX_SIZE_CHANNELS = 5;
    private Channel channel[];
    private int position;
    private Random random = new Random();

    public TV(){
        this.channel = new Channel[MAX_SIZE_CHANNELS];
    }
    public Channel[] getChanel(){
        return this.channel;
    }

    private void addChannelForTV(Channel channel){
        this.channel[position] = channel;
        position++;
    }
    public void showTV() {
        int k;
        k = random.nextInt(MAX_SIZE_CHANNELS);
        System.out.println("сейчас смотрим канал - " + channel[k].getName()+" на котором идет " +"передача - " +
                channel[k].randomProgram());
    }
    public Channel getChannel(int k){
        return channel[k];
    }
    public void getTV(int k) {
        System.out.println("сейчас смотрим канал - " + channel[k].getName()+" на котором идет " +"передача - " +
                channel[k].randomProgram());
    }
    public void newChannel(String name,int buttonNumber) {
        Channel channel = new Channel(name,buttonNumber);
        channel.addProgram(new Program(name + " Новости"));
        channel.addProgram(new Program(name + " Сериал"));
        channel.addProgram(new Program(name + " Мыльная опера"));
        channel.addProgram(new Program(name + " Фильм"));
        channel.addProgram(new Program(name + " Ток  шоу"));
        this.addChannelForTV(channel);
    }
}
