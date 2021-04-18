package se.iths.expleotests.problemone;
import java.lang.*;
import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {

        System.out.println(detectAnagram(args[0], args[1]));

    }


    public static boolean detectAnagram(String wordA, String wordB){
        char[] arrayA = wordA.toLowerCase().toCharArray();
        char[] arrayB = wordB.toLowerCase().toCharArray();

        boolean bool = false;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if(arrayA.length== arrayB.length)
            for (int i = 0; i < arrayA.length; i++) {
                if(arrayA[i] == arrayB[i]){
                    bool=true;
                }else{
                    bool= false;
                    break;
                }

            }

        return bool;
    }


}
