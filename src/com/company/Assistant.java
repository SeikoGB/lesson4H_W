package com.company;

public class Assistant {
    int addTwoNumber(int a,int b){
        int sum=a+b;
        return sum;
    }
    int pow(int a, int b){
        for (int i = 0; i < b; i++) {
            a*=a;
        }
        return a;
    }
    int abs(int num){
        int temp=num;
        if (num<0){
             temp-=num;
             temp-=num;
        }
        return temp;
    }
    int getWholeSection(double num){
        int temp=(int)num;
        double temp1=num;
        if (num<0){
            temp1-=num;
            temp1-=num;
        }
        if (temp1%1>=0.5){
            if (temp<0){
                temp-=2;
            }
            temp++;
        }
        return temp;
    }
}
