package Hw15;
import java.util.Scanner;

public class MainHw15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAction[] userActions = new UserAction[]{
                new CircleSquare(scanner),
                new RectangleSquare(scanner),
                new TriangleSquare(scanner)
        };

        printMenu(userActions);
        System.out.println("Оберіть пункт меню");

        int choice = scanner.nextInt() - 1;

        if (checkArrBounds(choice, userActions)){
            userActions[choice].doAction();
            System.out.println("\nОберіть пункт меню або закінчіть програму.");
            secondTry(userActions, scanner);
        } else {
            System.out.println("\nВи обрали невірний пункт меню. \nСпробуйте обрати ще раз або закінчіть програму.\n");
            secondTry(userActions, scanner);
        }
    }

    public static void printMenu(UserAction[] userAct){
        for (int i = 0; i < userAct.length; i++) {
            System.out.println(i+1 + " " + userAct[i].getName());
        }
    }

    public static boolean checkArrBounds(int ind, UserAction[] len){
        return (ind >=0 && ind < len.length);
    }

    public static void secondTry(UserAction[] userAct, Scanner sc){
        printMenu(userAct);
        System.out.println("4 Закінчити програму");
        int ch = sc.nextInt() - 1;
        if (checkArrBounds(ch, userAct)){userAct[ch].doAction();}
        System.out.println("Програму завршено.");
    }
}