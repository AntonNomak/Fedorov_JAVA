public abstract class  FlyTransport extends Transport {
    private static final int DEFAULT_KM = 0;
    private static final int DEFAULT_FUEL = 50;
    protected int amountOfFuel;
    protected int km;
    public FlyTransport(String model,int number,int size){
        super(model,number);
        this.size = size;
        this.amountOfFuel = DEFAULT_FUEL;
        this.km = DEFAULT_KM;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public  void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    public void refuel(int amountOfFuel){
        this.amountOfFuel = amountOfFuel;
    }

    public void fly(int km){
        if (amountOfFuel >= km/4){
            this.km+=km;
            amountOfFuel= amountOfFuel-(km/4);
        }
        else {
            System.out.println("Сэр,у нас не хватит топлива!");
        }
    }
}
