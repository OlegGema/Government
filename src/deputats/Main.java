package deputats;

//import java.lang.reflect.Array;

import java.util.Scanner;

/**
 * Created by Oleg on 21.06.2017.
 */
public class Main {/*Гема Олег*/
    public static void main(String[] args) {
        Rada rada=new Rada().getInstance();

        while (true){
            System.out.println("1-додати фракцію \n" +
                    "2-видалити фракцію \n" +
                    "3-очистити фракцію \n" +
                    "4-вивести всі фракції \n" +
                    "5-вивести фракцію \n" +
                    "6-додати депутата в фракцію \n" +
                    "7-видалити депутата з фракції \n" +
                    "8-вивести список хабарників \n" +
                    "9-вивести найбільшого хабарника \n" +
                    "10-дати хабаря \n" +
                    "0- Вихід \n");
            int choise=new Scanner(System.in).nextInt();

            switch (choise){
                case 1:
                    rada.newFraction();
                    break;
                case 2:
                    rada.deleteFraction();
                    break;
                case 3:
                    rada.deleteAllDeputatsFromFraction();
                    break;
                case 4:
                    rada.showAllFrations();
                    break;
                case 5:
                    rada.showFraction();
                    break;
                case 6:
                    rada.newDeputatInFraction();
                    break;
                case 7:
                    rada.deleteDeputatFromFraction();;
                    break;
                case 8:
                    rada.showAllBridersFromFraction();
                    break;
                case 9:
                    rada.showLargestBriderFromFraction();
                    break;
                case 10:
                    rada.giveABrideToDeputatFromFraction();
                    break;
                case 0:
                    System.out.println("Удачі!");
                    return;
                default:
                    System.out.println("Немає такої кнопки");
                    break;

            }
        }
    }
}
