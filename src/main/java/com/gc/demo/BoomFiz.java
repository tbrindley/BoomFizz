package com.gc.demo;

/**
 * Created by Travis Brindley on 7/27/2017.
 */
public class BoomFiz {

    // accepts int input value and returns the number or boom if contains a 7 or divisible by 7
    public String boom(int number){

        if((number%7) == 0 && number != 0){
           return  "Boom";
        }

        String newNum = Integer.toString(number);
            for(int i = 0; i < newNum.length(); i++){
                if(newNum.charAt(i) == '7'){
                    return "Boom";
                }
            }

        return newNum;
    }

}
