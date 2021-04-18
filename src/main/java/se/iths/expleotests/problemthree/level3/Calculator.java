package se.iths.expleotests.problemthree.level3;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(evaluate(args[0]));

    }



    private static double evaluate(String input){

        String[] numbers = input.split("((?<=[-+*/])|(?=[-+*/]))");
        List<String> numbersList = Arrays.asList(numbers);
        ArrayList<String> numbersList2 = new ArrayList<>(numbersList);
        Collections.reverse(numbersList2);
        double result = 0;

        double tempNumber = 0;

        for (int i = numbersList2.size()-1; i >0; i--) {


            if(numbersList2.get(i).equals("*")) {
                tempNumber = multiply(Double.parseDouble(numbersList2.get(i - 1).trim()), Double.parseDouble(numbersList2.get(i + 1).trim()));
                numbersList2.set(i - 1, String.valueOf(tempNumber));
                numbersList2.remove(i + 1);
                numbersList2.remove(i);



            }else if(numbersList2.get(i).equals("/")) {
                tempNumber = divide(Double.parseDouble(numbersList2.get(i+1).trim()), Double.parseDouble(numbersList2.get(i-1).trim()));
                numbersList2.set(i-1, String.valueOf(tempNumber));
                numbersList2.remove(i+1);
                numbersList2.remove(i);

            }

        }


        double firstNumber = Double.parseDouble(numbersList2.get(numbersList2.size()-1).trim());

        for (int i = numbersList2.size()-1; i > 0; i--) {
            if (numbersList2.get(i).equals("+")) {
                firstNumber = add(firstNumber, Double.parseDouble(numbersList2.get(i-1).trim()));
            } else if (numbersList2.get(i).equals("-")) {
                firstNumber = subtract(firstNumber, Double.parseDouble(numbersList2.get(i-1).trim()));
            }

        }
        result = firstNumber;
        return result;
    }



    private static double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    private static double subtract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    private static double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    private static double divide(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }
}
