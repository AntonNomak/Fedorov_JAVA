public class Car extends Transport{
   private final int DEFAULT_SIZE = 1;
    public Car(String model,int number){
        super(model,number);
        this.size = DEFAULT_SIZE;
    }

}
