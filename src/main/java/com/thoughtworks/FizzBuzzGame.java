package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    final int FizzNumber = 3;
    final int BuzzNumber = 5;
    final int WhizzNumber = 7;

    public void start(int count) {
        for(int i = 1; i <= count; i++){
            results.add(translate(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String translate(int number) {
        if(new Integer(number).toString().contains(new Integer(FizzNumber).toString()))
            return "Fizz";
        if(number % FizzNumber == 0 && number % BuzzNumber == 0 && number % WhizzNumber == 0)
            return "FizzBuzzWhizz";
        if(number % FizzNumber == 0 && number % BuzzNumber == 0)
            return "FizzBuzz";
        if(number % FizzNumber == 0 && number % WhizzNumber == 0)
            return "FizzWhizz";
        if(number % BuzzNumber == 0 && number % WhizzNumber == 0)
            return "BuzzWhizz";
        if(number % FizzNumber == 0)
            return "Fizz";
        if(number % BuzzNumber == 0)
            return "Buzz";
        if(number % WhizzNumber == 0)
            return "Whizz";
        return new Integer(number).toString();
    }
}


