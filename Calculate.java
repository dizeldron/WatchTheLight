import java.util.Scanner;

public class Calculate {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the numerator of the first fraction: ");

        int firstNum = getInt();
        System.out.println(firstNum + " :Is the numerator of the first fraction.");
        System.out.println("   Enter the denominator of the first fraction: ");

        int secondNum = getInt();
        System.out.println(secondNum + " : Is the denominator of the first fraction.");
        System.out.println("   Now the first fraction looks like this: " + firstNum + "/" + secondNum + ".");
        System.out.println("   Enter the numerator of the second fraction: ");

        int thirdNum = getInt();
        System.out.println(thirdNum + " : Is the numerator of the second fraction.");
        System.out.println("   Enter the denominator of the second fraction:");

        int fourthNum = getInt();
        System.out.println(fourthNum + " Is the denominator of the second fraction.");
        System.out.println("The fractions looks like : " + firstNum + "/" + secondNum + " and " + thirdNum + "/" + fourthNum);
        System.out.println("Choose what you want to do with the fractions:");
        System.out.println("Multiply: enter *");
        System.out.println("Divide: enter /");
        System.out.println("Add: enter +");
        System.out.println("Subtract: enter -");

        char operation = getOperation();
        int resultUp = numerator(firstNum, secondNum, thirdNum, fourthNum, operation);
        int resultDown = denominator(secondNum, thirdNum, fourthNum, operation);

        sc.close();

        System.out.println("The answer is :" + resultUp + "/" + resultDown);

    }

    public static int getInt() {
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("You have entered not a number. Please try again");
            sc.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Enter operation:");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            System.out.println("You made a mistake while entering the operation. Please try again.");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int numerator(int firstNum, int secondNum, int thirdNum, int fourthNum, char operation) {
        int resultUp;
        switch (operation) {
            case '+':
                resultUp = firstNum * fourthNum + secondNum * thirdNum;
                return resultUp;
            case '-':
                resultUp = firstNum * fourthNum - secondNum * thirdNum;
                return resultUp;
            case '*':
                resultUp = firstNum * thirdNum;
                return resultUp;
            case '/':
                resultUp = firstNum * fourthNum;
                return resultUp;
            default:
                System.out.println("The operation is not recognized. Repeat the input.");
                resultUp = numerator(firstNum, secondNum, thirdNum, fourthNum, getOperation());
        }
        return resultUp;
    }

    public static int denominator(int secondNum, int thirdNum, int fourthNum, char operation) {
        int resultDown;
        switch (operation) {
            case '+':
                resultDown = secondNum * fourthNum;
                return resultDown;
            case '-':
                resultDown = secondNum * fourthNum;
                return resultDown;
            case '*':
                resultDown = secondNum * fourthNum;
                return resultDown;
            case '/':
                resultDown = secondNum * thirdNum;
                return resultDown;
            default:
                System.out.println("The operation is not recognized. Repeat the input.");
                resultDown = denominator(secondNum, thirdNum, fourthNum, getOperation());

        }
        return resultDown;
    }

}
