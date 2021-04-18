package se.iths.expleotests.problemthree.level2;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(evaluate(args[0]));

            }




    private static double evaluate(String input){

        String[] numbers = input.split("((?<=[-+*/])|(?=[-+*/]))");
        double result = 0;
        double firstNumber = Double.parseDouble(numbers[0].trim());


        for (int i = 1; i < numbers.length - 1; i++) {

            if(numbers[i].equals("+")){
                firstNumber = add(firstNumber, Double.parseDouble(numbers[i+1].trim()));
            }else if(numbers[i].equals("-")){
                firstNumber = subtract(firstNumber, Double.parseDouble(numbers[i+1].trim()));
            }else if(numbers[i].equals("*")) {
                firstNumber = multiply(firstNumber, Double.parseDouble(numbers[i+1].trim()));
            }else if(numbers[i].equals("/")) {
                firstNumber = divide(firstNumber, Double.parseDouble(numbers[i+1].trim()));
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
