package Hw15;

import java.util.Scanner;

public abstract class UserAction {

    protected abstract void doAction();

    protected abstract String getName();

}

class CircleSquare extends UserAction {

    private final Scanner scanner;

    public CircleSquare(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {
        System.out.println("Введіть радіус круга");
        double radius = scanner.nextDouble();
        double square = Math.PI * Math.pow(radius,2);
        System.out.println("Площа круга дорівнює  = " + square);
    }

    @Override
    protected String getName() {
        return "Порахувати площу круга";
    }
}

class RectangleSquare extends UserAction {

    private final Scanner scanner;

    public RectangleSquare(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {
        System.out.println("Введіть довжину");
        double length = scanner.nextDouble();
        System.out.println("Введіть ширину");
        double width = scanner.nextDouble();
        double square = length * width;
        System.out.println("Площа прямокутника дорівнює = " + square);
    }

    @Override
    protected String getName() {
        return "Порахувати площу прямокутника";
    }
}

class TriangleSquare extends UserAction {

    private final Scanner scanner;

    public TriangleSquare(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    protected void doAction() {
        System.out.println("Введіть довжину першої сторони");
        double firstSide = scanner.nextDouble();
        System.out.println("Введіть довжину другої сторони");
        double secondSide = scanner.nextDouble();
        System.out.println("Введіть довжину третьої сторони");
        double thirdSide = scanner.nextDouble();

        double semiPerimiter = (firstSide + secondSide + thirdSide) /2;
        double square = Math.sqrt((semiPerimiter) * (semiPerimiter - firstSide) * (semiPerimiter - secondSide) * (semiPerimiter - thirdSide));
        System.out.println("Площа трикутника = " + square);
        }

    @Override
    protected String getName() {
        return "Порахувати площу трикутника";
    }

}