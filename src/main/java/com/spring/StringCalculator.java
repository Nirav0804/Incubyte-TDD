package com.spring;

public class StringCalculator {

    public String addNewDelimiter(String newDelimiter, String delimiters) {
        String updatedDelimiters = delimiters.substring(0, delimiters.length() - 1); // get the substring that do not have "]"
        updatedDelimiters += newDelimiter + "]"; // add newDelimiter and "]"
        return updatedDelimiters;
    }

    public int calculateSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public int add(String input) {
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
