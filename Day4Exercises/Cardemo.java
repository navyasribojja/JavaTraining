package Day4Exercises;

public class Cardemo {


public static void main(String[] args) {
        Car car = new Car();
        car.drive(100, 5);
        car.display();

        System.out.println("\nSportCar:");
        Sportscar sportCar = new Sportscar();
        sportCar.drive(150, 6, "Type A");
        sportCar.display();
    }
}




