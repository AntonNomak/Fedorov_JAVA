public class Parking {
    public int getMAX_SIZE_PARKING() {
        return MAX_SIZE_PARKING;
    }

    private final int MAX_SIZE_PARKING = 10;
    private ParkingPlace parkingPlaces[];
    private Transport transport;
    private int countPlacesNearby;

    public int getCountPlacesNearby() {
        return countPlacesNearby;
    }

    public Parking() {
        this.parkingPlaces = new ParkingPlace[MAX_SIZE_PARKING];
        for (int i = 0; i < parkingPlaces.length; i++) {
            parkingPlaces[i] = new ParkingPlace(i);
        }
    }

    public void showParkingPlaces() {
        countPlacesNearby = 0;
        for (int i = 0; i < parkingPlaces.length; i++) {
            if (parkingPlaces[i].getNumberOfTransport() == 0) {
                System.out.println("Парковочное место под номером " + (i+1) + " свободно");
            } else {
                System.out.println("Парковочное место под номером " + (i+1) + " занято транспортным средством с гос. номером "
                        + parkingPlaces[i].getNumberOfTransport());
            }
        }

    }

    public int requestFreePlaces() {
        int max_seq = 0;
        for (int i = 0, cur_seq = 0; i < parkingPlaces.length; ++i) {
            if (parkingPlaces[i].getNumberOfTransport() == 0) {
                cur_seq++;
            }
            if (i == parkingPlaces.length - 1 || parkingPlaces[i].getNumberOfTransport() != 0) {
                if (cur_seq >= max_seq) {
                    max_seq = cur_seq;
                    cur_seq = 0;
                }

            }
        }
        return max_seq;
    }
    public void checkTheParking(int number, int size){
        int countArray1;
        int countIndex = 0;
        int [] array2 = new int[size];
        int result = 0;
        for (int i = 0; i < parkingPlaces.length ; i++) {
            if(parkingPlaces[i].getNumberOfTransport() == number){
                System.out.println("На парковке уже стоит транспорт с вашим гос.номером");
                return;
            }
        }
        for (int i = 0; i < parkingPlaces.length; i++) {
            if (parkingPlaces[i].getNumberOfTransport() == array2[0]){
                countArray1 = i;
                for (int j = 0; j <array2.length ; j++) {
                    if(array2[j] == parkingPlaces[countArray1].getNumberOfTransport()) {
                        countIndex++;
                        countArray1++;
                        if (countIndex == array2.length){
                            result = countArray1 - countIndex;
                            for (int k = 0; k < size ; k++) {
                                parkingPlaces[result].setNumberOfTransport(number);
                                result++;
                            }
                            return;
                        }
                    }
                    else {
                        countIndex = 0;
                        countArray1 = 0;
                    }
                }
            }
        }
    }
public void leaveParking(int number){
    for (int i = 0; i < parkingPlaces.length ; i++) {
        if(parkingPlaces[i].getNumberOfTransport() == number){
            parkingPlaces[i].setNumberOfTransport(0);
        }
    }
}




    }



