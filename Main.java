import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        /*
            1. Write a Java program to print the sum (addition), multiply,
            subtract, divide and remainder of two numbers , takes two numbers as input
         */
//        System.out.print("Input first number: ");
//        int first_number = input.nextInt();
//        System.out.print("Input second number:");
//        int second_number = input.nextInt();
//
//        System.out.println("- Addition : " + first_number + "+" + second_number + "=" + (first_number + second_number));
//        System.out.println("- Subtract : " + first_number + "-" + second_number + "=" + (first_number - second_number));
//        System.out.println("- Multiply : " + first_number + "*" + second_number + "=" + (first_number * second_number));
//        System.out.println("- Divide : " + first_number + "/" + second_number + "=" + (first_number / second_number));
//        System.out.println("- Remainder : " + first_number + "mod" + second_number + "=" + (first_number % second_number));

        /*
        2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
         */
//        System.out.print("Enter a Number :");
//        int number = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + "X" + i + "=" + (number * i));
//        }

        /*
        3. Write a Java program to print the area and perimeter of a circle.
         */
//        double radius = 1;
//        double perimeter;
//        double area;
//
//        System.out.print("Enter a number of radius :");
//        radius = input.nextDouble();
//
//        perimeter = 2 * Math.PI * radius;
//        area = Math.PI * radius * radius;
//
//        System.out.println("Perimeter is :" + perimeter);
//        System.out.println("Area is :" + area);

        /*
        4. Java program to find out the average of a set of integers
         */
//        System.out.print("Enter the count of numbers: ");
//        int count = input.nextInt();
//
//        int sum = 0;
//
//        for (int i = 0; i < count; i++) {
//            System.out.print("Enter integer " + (i + 1) + ": ");
//            int number = input.nextInt();
//            sum += number;
//        }
//        double average = (double) sum / count;
//
//        System.out.println("The average is: " + average);


        /*
        5. Write a Java program that accepts three integers as input,
        adds the first two integers together, and then determines whether the sum is equal to the third integer.
         */

//        int num1;
//        int num2;
//        int num3;
//        System.out.print("Input the first number : ");
//        num1 = input.nextInt();
//        System.out.print("Input the second number:");
//        num2 = input.nextInt();
//        System.out.print("Input the third number :");
//        num3 = input.nextInt();
//
//        int sum = num1 + num2;
//        boolean result = (sum == num3);
//
//        System.out.println("The result is :" + result);

        /*
        6. Write a Java program to reverse a word.
         */
//        String word;
//        String reversed = "";
//
//        System.out.print("Input a word:");
//        word = input.nextLine();
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversed += word.charAt(i);
//        }
//        System.out.println("Reverse word:" + reversed);

        /*
        7 - Java program to check whether the given number is even or odd
         */
//        int number;
//        System.out.print("Enter a number :");
//        number = input.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("The number is Even");
//        } else {
//            System.out.println("The number is Odd");
//        }

        /*
        8 - Java program to convert the temperature in Centigrade to Fahrenheit
         */
//        double centigrade;
//        System.out.print("Enter temperature in Centigrade:");
//        centigrade = input.nextDouble();
//
//        double fahrenheit = (centigrade * 9 / 5) + 32;
//        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        /*
        9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
         */
//        System.out.print("Input a string: ");
//        String str = input.nextLine();
//
//        System.out.print("Input a number: ");
//        int index = input.nextInt();
//
//        if (index >= 0 && index < str.length()) {
//            char character = str.charAt(index);
//            System.out.println(character);
//        } else {
//            System.out.println("Invalid index! Please enter an index between 0 and " + (str.length() - 1));
//        }

        /*
        10. Write a Java program to print the area and perimeter of a rectangle.
         */
//        double width;
//        double height;
//        double perimeter;
//        double area;
//
//        System.out.print("Enter width :");
//        width = input.nextDouble();
//        System.out.print("Enter height :");
//        height = input.nextDouble();
//
//        perimeter = 2 * (height + width);
//        area = height * width;
//
//        System.out.println("Area is : " + width + " * " + height + " = " + area);
//        System.out.println("Perimeter is : 2 * (" + width + "*" + height + ") = " + perimeter);

        /*
        11. Write a Java program to compare two numbers.
         */
//        System.out.print("Input first integer:");
//        int num1 = input.nextInt();
//        System.out.print("Input second integer:");
//        int num2 = input.nextInt();
//
//        if (num1 == num2) {
//            System.out.println(num1 + " == " + num2);
//        } else {
//            System.out.println(num1 + " != " + num2);
//        }
//
//        if (num1 < num2) {
//            System.out.println(num1 + " < " + num2);
//        } else if (num1 > num2) {
//            System.out.println(num1 + " > " + num2);
//        }
//
//        if (num1 <= num2) {
//            System.out.println(num1 + " <= " + num2);
//        } else {
//            System.out.println(num1 + " >= " + num2);
//        }

        /*
        12. Write a Java program to convert seconds to hours, minutes and seconds.
         */
//        System.out.print("Input Seconds : ");
//        int totalSeconds = input.nextInt();
//
//        int hours = totalSeconds / 3600;
//        int minutes = (totalSeconds % 3600) / 60;
//        int seconds = totalSeconds % 60;
//        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

        /*
        13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
         */
//        System.out.print("Input first number:");
//        int num1 = input.nextInt();
//        System.out.print("Input second number:");
//        int num2 = input.nextInt();
//        System.out.print("Input third number:");
//        int num3 = input.nextInt();
//        System.out.print("Input fourth number:");
//        int num4 = input.nextInt();
//
//        if (num1 == num2 && num3 == num4) {
//            System.out.println("Numbers are equal!");
//        } else {
//            System.out.println("Numbers are not equal!");
//        }

        /*
        14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         */
//        System.out.print("Input a number:");
//        int num = input.nextInt();
//        if (num > 0) {
//            System.out.println("Number is positive");
//        } else if (num < 0) {
//            System.out.println("Number is negative");
//        } else {
//            System.out.println("Number is zero");
//        }

        /*
            15.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
            (End loop use -1 , Don’t count -1).
         */
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        System.out.println("Enter integers (type -1 to finish):");
//
//        while (true) {
//            System.out.print("");
//            int number = input.nextInt();
//            if (number == -1) {
//                break;
//            }
//            if (number > 0) {
//                positive++;
//            } else if (number < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//        }
//        System.out.println(positive + " Positives");
//        System.out.println(zero + " Zero");
//        System.out.println(negative + " Negatives");

        /*
        16 - Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         */
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        int reversedNumber = 0;
//        int mod;
//
//        while (number != 0) {
//            mod = number % 10;
//            reversedNumber = reversedNumber * 10 + mod;
//            number = number / 10;
//        }
//        System.out.println("Reversed number: " + reversedNumber);

        /*
        17 - Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
         */
//        int number;
//        int max = 0;
//        int min = 0;
//
//        System.out.println("Enter integers (type 0 to finish):");
//        while (true) {
//            System.out.print("");
//            number = input.nextInt();
//
//            if (number == 0) {
//                break;
//            }
//            if (number > max) {
//                max = number;
//            }
//            if (number < min) {
//                min = number;
//            }
//
//        }
//        System.out.println("Largest Number : " + max);
//        System.out.println("Smallest Number : " + min);


        /*
        18 - Determine and print the number of times the character ‘a’ appears in the input entered by the user.
         */
//        System.out.print("enter String :");
//        String sentence = input.nextLine();
//
//        int count = 0;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') {
//                count++;
//            }
//        }
//        System.out.println("The character 'a' appears " + count + " times in the sentence.");


    }}