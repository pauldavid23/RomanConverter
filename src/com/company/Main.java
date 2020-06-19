package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 1000: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine();
                if (number >= 1 && number <= 1000) {
                    String message = "The Roman Numeral number is: ";
                    int lastDigit = 0;
                    int firstDigit = 0;

                    lastDigit = number % 10;  // 120;

                    firstDigit = number / 10;   // 999 ;

                    if (firstDigit > 10) {
                        firstDigit = number / 100; //Extract the hundreds
                        number = number % 100; // get remainder
                        int midDigit = number/10; //Extract the tens
                        lastDigit = number % 10; // Extract the ones

                        switch (firstDigit) {
                            case 1:
                                System.out.print(message + "C");
                                break;
                            case 2:
                                System.out.print(message + "CC");
                                break;
                            case 3:
                                System.out.print(message + "CCC");
                                break;
                            case 4:
                                System.out.print(message + "CD");
                                break;
                            case 5:
                                System.out.print(message + "D");
                                break;
                            case 6:
                                System.out.print(message + "DC");
                                break;
                            case 7:
                                System.out.print(message + "DCC");
                                break;
                            case 8:
                                System.out.print(message + "DCC");
                                break;
                            case 9:
                                System.out.print(message + "CM");
                                break;
                            case 10:
                                System.out.println(message + "M");
                                break;
                        }

                            switch (midDigit) {
                                case 1:
                                    System.out.print("X");
                                    break;
                                case 2:
                                    System.out.print("XX");
                                    break;
                                case 3:
                                    System.out.print("XXX");
                                    break;
                                case 4:
                                    System.out.print("XL");
                                    break;
                                case 5:
                                    System.out.print("L");
                                    break;
                                case 6:
                                    System.out.print("LX");
                                    break;
                                case 7:
                                    System.out.print("LXX");
                                    break;
                                case 8:
                                    System.out.print("LXXX");
                                    break;
                                case 9:
                                    System.out.print("XC");
                                    break;
                        }
                        switch (lastDigit) {
                            case 1:
                                System.out.print("I");
                                break;
                            case 2:
                                System.out.print("II");
                                break;
                            case 3:
                                System.out.print("III");
                                break;
                            case 4:
                                System.out.print("IV");
                                break;
                            case 5:
                                System.out.print("V");
                                break;
                            case 6:
                                System.out.print("VI");
                                break;
                            case 7:
                                System.out.print("VII");
                                break;
                            case 8:
                                System.out.print("VIII");
                                break;
                            case 9:
                                System.out.print("IX");
                                break;
                        }
                    } else {
                        switch (firstDigit) {
                            case 1:
                                System.out.print(message + "X");
                                break;
                            case 2:
                                System.out.print(message + "XX");
                                break;
                            case 3:
                                System.out.print(message + "XXX");
                                break;
                            case 4:
                                System.out.print(message + "XL");
                                break;
                            case 5:
                                System.out.print(message + "L");
                                break;
                            case 6:
                                System.out.print(message + "LX");
                                break;
                            case 7:
                                System.out.print(message + "LXX");
                                break;
                            case 8:
                                System.out.print(message + "LXXX");
                                break;
                            case 9:
                                System.out.print(message + "XC");
                                break;
                        }
                        switch (lastDigit) {
                            case 1:
                                System.out.print("I");
                                break;
                            case 2:
                                System.out.print("II");
                                break;
                            case 3:
                                System.out.print("III");
                                break;
                            case 4:
                                System.out.print("IV");
                                break;
                            case 5:
                                System.out.print("V");
                                break;
                            case 6:
                                System.out.print("VI");
                                break;
                            case 7:
                                System.out.print("VII");
                                break;
                            case 8:
                                System.out.print("VIII");
                                break;
                            case 9:
                                System.out.print("IX");
                                break;
                        }
                    }

                    } else {
                    System.out.println("Output exceeded!");
                }

        } else {
            System.out.println("Invalid value!");
        }
    }

}
