package com.spring;

public class StringCalculator {

    public int add(String input){
        String delimiters = "[,\\n]";// Default delimiters
        if(input.isEmpty()){ // Handling empty String.
            return 0;
        }
        int sum = 0;
        String[] numbers= input.split(delimiters);// Split the numbers with delimiters.

        for(int i=0; i<numbers.length; i++){
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
