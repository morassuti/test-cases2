package Module1_Level3;

import java.util.Scanner;

// Code to exercise basic OOP without constructor
// training
public class TestCar {
    public static void main(String[] args) {

        Cars car1 = new Cars();
        Cars car2 = new Cars();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter color car 1: ");
        car1.setColor(input.next());
        System.out.println("Enter color car 2: ");
        car2.setColor(input.next());

        System.out.println("Enter model car 1: ");
        car1.setModel(input.next());
        System.out.println("Enter model car 2: ");
        car2.setModel(input.next());

        car1.startCar();
        car1.stopCar();
        car2.startCar();
        car2.stopCar();

        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        System.out.println(car1.getModel());
        System.out.println(car2.getModel());
    }
}
