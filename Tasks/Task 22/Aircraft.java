public class  Aircraft extends FlyTransport {

    public Aircraft(String model,int number,int size) {
        super(model, number, size);
    }
    @Override
    public void fly(int km){
        if (amountOfFuel >= km/10){
            this.km+=km;
            amountOfFuel= amountOfFuel-(km/10);
        }
        else {
            System.out.println("Сэр,у нас не хватит топлива!");
        }
    }



}
