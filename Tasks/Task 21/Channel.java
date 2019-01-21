import java.util.Random;

public class Channel {
    private final int MAX_SIZE_PROGAMS = 5;
    private String name;
    private Program program[];
    private int position;
    private int buttonNumber;
    private Random random = new Random();

    public Channel(String name,int buttonNumber) {
        this.name = name;
        this.buttonNumber = buttonNumber;
        this.program = new Program[MAX_SIZE_PROGAMS];
    }
    public String getName(){
        return name;
    }
    public int getButtonNumber(){
        return buttonNumber;
    }
        public void addProgram(Program program){
            this.program[position] = program;
            position++;
        }
        public void showProgram(){
            for (int i = 0; i < this.program.length ; i++) {
                System.out.println(program[i].getName());
            }
        }
        public String randomProgram(){
           // System.out.println("Сейчас на канале идет - " + program[random.nextInt(MAX_SIZE_PROGAMS)].getName());
            return program[random.nextInt(MAX_SIZE_PROGAMS)].getName();
        }




    }

