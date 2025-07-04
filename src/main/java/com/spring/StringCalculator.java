package com.spring;

public class StringCalculator {

    public int add(String input){
        if(input.isEmpty()){ // Handling empty String.
            return 0;
        }
        int sum = 0;
        String[] numbers= input.split(",");// Split the numbers with delimiter.

        for(int i=0; i<numbers.length; i++){
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
