package com.example.coa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class questionb {

    public static void main(String[] args){
        Scanner scan;
        int num;
        double num2,fractionalPart= 0,number;
        int selection;
        int rem=0,integralPart,k,y;
        StringBuilder s=new StringBuilder();
        StringBuilder v= new StringBuilder();


        scan = new Scanner(System.in);
        System.out.println("To convert a whole number enter 1 else enter 2 to convert fraction number");
        selection = Integer.parseInt(scan.nextLine());

        if (selection ==1){

            String hexa;
            String binary;
            int randomNumber;
            final int[] ints = new Random().ints(1, 50).distinct().limit(30).toArray();
            System.out.println(Arrays.toString(ints));
            for(int j=0;j<ints.length;j++){
                randomNumber = ints[j];
                System.out.println("Decimal Value :" + randomNumber);
                 hexa = Integer.toHexString(ints[j]);
                System.out.println("To hexadecimal :" + hexa);
                 binary = Integer.toBinaryString(ints[j]);
                System.out.println("Binary is :" + binary);
                System.out.println("\n" +
                        "Next number");
            }

        }else if(selection == 2) {
            String hexa;
            double randomNumber;
            final double[] doubles = new Random().doubles(1.0, 50.0).distinct().limit(30).toArray();
            System.out.println(Arrays.toString(doubles));

            k = 5;

            for (int j = 0; j < doubles.length; j++){
                randomNumber = doubles[j];
                System.out.print("Binary is ");
                int n = (int) randomNumber;
                fractionalPart = randomNumber - n;
                while (n != 0) {
                    rem = n % 2;
                    n = n / 2;
                    s.insert(0, rem);
                    v.insert(0,rem);
                }
                System.out.print(s + ".");
                s = new StringBuilder();
                while (k != 0) {
                    integralPart = (int) (fractionalPart * 2);
                    s.append(integralPart);
                    number = fractionalPart * 2;
                    fractionalPart = number - integralPart;
                    k--;
                }
                System.out.println(s);
                hexa = Double.toHexString(randomNumber);
                System.out.println("Hexadecimal :" + hexa);
                System.out.println("Decimal Value :" + randomNumber);

                System.out.println("\n" +
                        "Next number");
                k = 5;
            }

        }else{
            System.out.println("Invalid input");
        }
    }
}

