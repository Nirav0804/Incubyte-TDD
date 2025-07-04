package com.spring;

public class StringCalculator {

    public int add(String input){
        if(input.isEmpty()){
            return 0;
        }
        int sum = 0;
        String[] numbers= input.split(",");
        if(numbers.length == 1){
            sum = Integer.parseInt(numbers[0]);
        }
        if(numbers.length == 2){
            sum =  Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
        }
        return sum;
    }
}
