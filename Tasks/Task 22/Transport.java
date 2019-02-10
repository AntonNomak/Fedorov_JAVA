public abstract class Transport {
    private final int DEFAULT_SIZE = 1;
    private String model;
    private int number;
    private Parking parking;
    protected int size;

    public Transport(String model,int number){
        this.model = model;
        this.number = number;
        this.size = DEFAULT_SIZE;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }
    public void parking(Parking parking) {
        if (parking.requestFreePlaces() >= this.size){
            parking.checkTheParking(number,size);

        }
        else {
            System.out.println("Для вашего траспортного средства мест нет");
        }
    }
    public void leaveParking(Parking parking){
        parking.leaveParking(number);
        System.out.println("Транспорт с гос.номером " + number + " покинул парковку");

        }
    }

