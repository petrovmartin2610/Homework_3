package Homework3;
import java.util.Scanner;
import java.util.Random;

public class Homework3_Main {

    public static void main(String[] args) {
        whatIsTheObstacle();
        areaAndEnemyAnalysis();
        checkOutletElectricity();
        numbersCountdown();
    }

    //task 1
    public static void whatIsTheObstacle() {
        //answers of the boolean variables must be typed as "true" or "false"
        Scanner obstacleDefiner = new Scanner(System.in);
        System.out.println("Is the obstacle a wall?");
        boolean nameObstacle = obstacleDefiner.nextBoolean();
        if (nameObstacle == false) {
            System.out.println("Is the obstacle a chair?");
            boolean nameAnotherObstacle = obstacleDefiner.nextBoolean();
            if (nameAnotherObstacle == true) {
                System.out.println("Jump");
            } else {
                System.out.println("Forward");
            }
        } else {
            System.out.println("Go sideways");
        }

    }

    //tasks 2 & 3
    public static void areaAndEnemyAnalysis() {
        float areaPixelNumber;
        int numberOfAvailableHits = 4;

        Random randNumberGenerator = new Random();
        int randomNumberBetw1And10 = randNumberGenerator.nextInt(10)+1;
        Scanner enterPixelNumber = new Scanner(System.in);

        do {
        System.out.println("Enter the number of pixels for the current area: ");
        areaPixelNumber = enterPixelNumber.nextFloat();

            if (areaPixelNumber % 2 == 0) {
                System.out.println("Pest detected - attack!");
                    if (randomNumberBetw1And10==5){
                        System.out.println("Pest neutralised with severe area damage!");
                    } else {
                        System.out.println("Pest neutralised without any area damage!");
                }
                numberOfAvailableHits--;
            } else {
                System.out.println("The coast is clear");
            }

           if (numberOfAvailableHits==0){
               System.out.println("Battery exhausted, head over to nearest outlet to recharge!");
           }
        } while (numberOfAvailableHits>0);

    }

    //task 4
    public static int checkOutletElectricity() {
        Random electricityState = new Random();
        int electricityState1 = electricityState.nextInt(999) + 1;
        int electricityState2 = electricityState.nextInt(999) + 1;

        if (electricityState1 > electricityState2) {
            System.out.println("Charging started successfully!");
        } else if (electricityState1 < electricityState2) {
            System.out.println("No electricity in the current outlet, please choose another one!");
        }

        for (electricityState1=electricityState2; ; ) {
            if (electricityState1 > electricityState2) {
                System.out.println("Charging started successfully!");
            } else if (electricityState1 < electricityState2) {
                System.out.println("No electricity in the current outlet, please choose another one!");
            }
        }

    }

    //task 5
    public static void numbersCountdown(){
        int i = 0;
        int[] countdownNumbers = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
              for(i=0; i<=10; i++){
                  if (i%2==0){
                      System.out.print("I am a robotttt"+ " " );
                  }
                  System.out.println(countdownNumbers[i] + " ");

        }

    }

}


