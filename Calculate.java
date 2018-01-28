 import java.io.IOException;
 import java.util.InputMismatchException;
 import java.util.Scanner;

public class Calculate {


    private static int ReadInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) throws Exception {
        int firstNum;
        int secondNum;
        int thirdNum;
        int fourthNum;
        int upperResult;
        int lowerResult;
        String operations;


        Scanner sc = new Scanner(System.in);

        System.out.println("WARNING!!! Input only integers, no exception handlers envisaged\n"
                + "Enter numerator of the first fraction\n");
        try {
            if (sc.hasNextInt()) {
                int first = sc.nextInt();
                firstNum = first;
                System.out.println(first + " :Is the numerator of the first fraction");
                System.out.println("   Enter denominator of the first fraction");


                if (!sc.hasNextInt()) {


                } else {
                    int second = sc.nextInt();
                    secondNum = second;
                    System.out.println(secondNum + " :Is the denominator of the first fraction");
                    System.out.println("   Now the first fraction looks like this: " + first + "/" + second + "\n");

                    System.out.println("   Enter the numerator of the second fraction");

                    if (!sc.hasNextInt()) {
                        System.out.println("Enter a possitive integer");
                    } else {
                        int third = sc.nextInt();
                        thirdNum = third;
                        System.out.println(third + " : Is the numerator of the second fraction");
                        System.out.println("   Enter the denominator of the second fraction");

                        if (!sc.hasNextInt()) {
                            System.out.println("Enter a possitive integer");
                        } else {
                            int fourth = sc.nextInt();
                            fourthNum = fourth;
                            System.out.println(fourth + " Is the denominator of the second fraction");

                            System.out.println("The fractions looks like : " + first + "/" + second + " and " + third + "/" + fourth);
                            System.out.println("Choose what you want to do with the fractions:\n");
                            System.out.println("Muptiply: enter *");
                            System.out.println("Divide: enter /");
                            System.out.println("Append: enter +");
                            System.out.println("Substract: enter -");
                            System.out.println("Enter operation in the the specified sequence. AS ABOVE\n");

                            if (sc.next().equals("*")) {
                                upperResult = first * third;
                                lowerResult = second * fourth;
                                System.out.println("The answer of multiplying fractions is: "
                                        + upperResult + "/" + lowerResult);

                                if (sc.next().equals("/"))

                                    upperResult = first * fourth;
                                lowerResult = second * third;
                                System.out.println("The answer of divining fractions is: "
                                        + upperResult + "/" + lowerResult);


                                if (sc.next().equals("+"))
                                    lowerResult = second * fourth;
                                upperResult = first * fourth + second * third;
                                System.out.println("The answer of appending fractions is: "
                                        + upperResult + "/" + lowerResult);

                                if (sc.next().equals("-"))
                                    lowerResult = second * fourth;
                                upperResult = first * fourth - second * third;
                                System.out.println("The answer of substracting fractions is: "
                                        + upperResult + "/" + lowerResult);


                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Input a integer!");


        }

    }
}

