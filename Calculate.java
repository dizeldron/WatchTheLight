import java.util.Scanner;

public class Calculate {

    static Scanner sc = new Scanner(System.in);

    private static int firstNumerator;
    private static int firstDenominator;
    private static int secondNumerator;
    private static int secondDenominator;



    public static void main(String[] args) {

        System.out.println("Enter the numerator of the first fraction: ");

        firstNumerator = getInt();
        System.out.println(firstNumerator + " :Is the numerator of the first fraction.");
        System.out.println("   Enter the denominator of the first fraction: ");

        firstDenominator = getInt();
        System.out.println(firstDenominator+ " : Is the denominator of the first fraction.");
        System.out.println("   Now the first fraction looks like this: " + firstNumerator + "/" + firstDenominator+ ".");
        System.out.println("   Enter the numerator of the second fraction: ");

        secondNumerator = getInt();
        System.out.println(secondNumerator + " : Is the numerator of the second fraction.");
        System.out.println("   Enter the denominator of the second fraction:");

        secondDenominator = getInt();
        System.out.println(secondDenominator + " Is the denominator of the second fraction.");
        System.out.println("The fractions looks like : " + firstNumerator + "/" + firstDenominator + " and " +
                            secondNumerator + "/" + secondDenominator);
        System.out.println("Choose what you want to do with the fractions:");
        System.out.println("Multiply: enter *");
        System.out.println("Divide: enter /");
        System.out.println("Add: enter +");
        System.out.println("Subtract: enter -");

        char operation = getOperation();
        int resultUp = numerator (firstNumerator, firstDenominator, secondNumerator, secondDenominator, operation);
        int resultDown = denominator(firstDenominator, secondNumerator, secondDenominator, operation);

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

        public static char setOperationPlus() {
            char operation = '+';
            return operation;
        }
        public static char setOperationMinus() {
        char operation = '-';
        return operation;
        }
        public static char setOperationDivine() {
            char operation = '/';
            return operation;
        }
        public static char setOperationMultiply() {
        char operation = '*';
        return operation;
    }




    public static int numerator(int firstNum, int secondNum, int thirdNum, int fourthNum, char operation) {
        int resultUp = 0;
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
