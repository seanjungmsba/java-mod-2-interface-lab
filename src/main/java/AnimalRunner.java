import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalRunner {

    private static void log(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        CanFly userBird = getUserBird();
        int falconSpeed = getFalconSpeed();

        int birdSpeed = userBird.fly();
        if (birdSpeed > falconSpeed) {
            log("Your bird was fast enough to escape from Falcon!");
        } else {
            log("Your bird was not fast enough to escape from Falcon :(");
        }
    }

    private static CanFly getUserBird() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            log("Please enter the type of bird you would like");
            log("1. Hawk");
            log("2. Duck");
            try {
                int userSelection = inputScanner.nextInt();
                if (userSelection == 1) {
                    return new Hawk();
                } else if (userSelection == 2) {
                    return new Duck();
                } else {
                    throw new InputMismatchException("Value must be either 1 or 2");
                }
            } catch(InputMismatchException inputException) {
                inputScanner.nextLine(); // clear the invalid input
                log("Invalid input: " + inputException.getMessage());
            }
        }
    }

    private static int getFalconSpeed() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            log("How fast do you want Falcon to fly (in mph)?");
            try {
                int falconSpeed = inputScanner.nextInt();
                return falconSpeed;
            } catch(InputMismatchException inputException) {
                inputScanner.nextLine(); // clear the invalid input
                log("Invalid input: " + inputException.getMessage());
            }
        }
    }
}