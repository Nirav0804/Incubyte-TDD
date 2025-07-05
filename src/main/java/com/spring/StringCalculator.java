package com.spring;

import java.util.ArrayList;

public class StringCalculator {
    private int count =0;

    public int getCalledCount(){
        return this.count;
    }
    public String addNewDelimiter(String newDelimiter, String delimiters) {
        String updatedDelimiters = delimiters.substring(0, delimiters.length() - 1); // get the substring that do not have "]"
        updatedDelimiters += newDelimiter + "]"; // add newDelimiter and "]"
        return updatedDelimiters;
    }

    public int calculateSum(String[] numbers) {
        int sum = 0;
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if(num>1000){
                continue;
            }
            if(num <0) {
                negativeNumbers.add(num);
            }
            sum += num;
        }
        if(negativeNumbers.size() > 0) {
            throw new IllegalArgumentException("negative numbers are not allowed " + negativeNumbers);
        }
        return sum;
    }

    public int add(String input) throws IllegalArgumentException {
        count++;
        String delimiters = "[,\\n]";  // Default delimiters

        if (input.isEmpty()) {
            return 0;
        }

        if (input.startsWith("//")) {
            int delimiterStartIndex = 2; // "//" length
            int delimiterEndIndex = input.indexOf("\n"); // get the index of first "\n"
            String newDelimiter = input.substring(delimiterStartIndex, delimiterEndIndex);// get new delimiter
            input = input.substring(delimiterEndIndex + 1); // get new substring having all numbers and delimiters
            delimiters = addNewDelimiter(newDelimiter, delimiters);
        }

        String[] numbers = input.split(delimiters);
        return calculateSum(numbers);
    }
}
