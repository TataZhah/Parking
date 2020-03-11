package by.parking;

import java.util.Scanner;

public class Parkomat {

    private Scanner scanner;

    public void helloMessage(String map) {
        System.out.println(map);
        System.out.println("Hello. Please enter license plate number!");
    }

    public String readPlateNumber() {
        while (true) {
            System.out.print("plate number: ");
            if (scanner == null) {
                scanner = new Scanner(System.in);
            }
            String newPlateNumber = scanner.next();
            if (newPlateNumber != null
                    && !"".equals(newPlateNumber.trim())) {
                return newPlateNumber;
            }

        }
    }

    public void showParkingFull() {
        System.out.println("The are no free places");
    }

    public void showParkedPlace(int placeNumber) {
        System.out.println("Successfully parked on the place " + placeNumber);
    }

    public void showGoodBye(String PlateNumber) {
        System.out.println("Good bye car " + PlateNumber);
    }
}
