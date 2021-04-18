package se.iths.expleotests.problemthree.level1;
import java.lang.*;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(evaluate(args[0]));

    }


    public static double evaluate(String input) {

        char[] inputArray = input.toCharArray();
        String[] numbers = input.split("[-+*/]");
        double result = 0;


        for (int i = 0; i < inputArray.length; i++) {

            if(inputArray[i]=='+'){
                result = add(Double.parseDouble(numbers[0].trim()), Double.parseDouble(numbers[1].trim()));
                break;
            }else if(inputArray[i]=='-'){
                result = subtract(Double.parseDouble(numbers[0].trim()), Double.parseDouble(numbers[1].trim()));
                break;
            }else if(inputArray[i]=='*'){
                result = multiply(Double.parseDouble(numbers[0].trim()), Double.parseDouble(numbers[1].trim()));
                break;
            }else if(inputArray[i]=='/'){
                result = divide(Double.parseDouble(numbers[0].trim()), Double.parseDouble(numbers[1].trim()));
                break;
            }

        }
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





