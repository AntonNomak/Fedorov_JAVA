public class Main {
    public static void main(String[] args) {
       Aircraft boing = new Aircraft("boing",777,5);
       boing.fly(100);
        System.out.println(boing.getKm());
        boing.refuel(100);
        System.out.println(boing.getAmountOfFuel());
        Parking parking1 = new Parking();
        boing.parking(parking1);
        parking1.showParkingPlaces();
    }
}
