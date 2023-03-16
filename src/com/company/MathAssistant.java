package com.company;

public class MathAssistant {
    int number;

    int pow(int degree){
        for (int i = 0; i < degree; i++) {
            number*=number;
        }
        return number;
    }
    int sumDigitsNumbers(){
        int temp=number;
        int sum=0;
        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return sum;
    }
}
