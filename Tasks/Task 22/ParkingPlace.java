public class ParkingPlace {
    private int numberOfParkingPlace;
    private  int numberOfTransport;

    public int getNumberOfParkingPlace() {
        return numberOfParkingPlace;
    }

    public void setNumberOfTransport(int numberOfTransport) {
        this.numberOfTransport = numberOfTransport;
    }

    public int getNumberOfTransport() {
        return numberOfTransport;
    }

    public void setNumberOfParkingPlace(int numberOfParkingPlace) {
        this.numberOfParkingPlace = numberOfParkingPlace;
        this.numberOfTransport = 0;
    }

    public ParkingPlace(int number){
        this.numberOfParkingPlace = number;
    }
}

