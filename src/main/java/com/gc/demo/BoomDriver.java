package com.gc.demo;

/**
 * Created by Travis Brindley on 7/27/2017.
 */
public class BoomDriver {
    public static void main(String[] args) {
        BoomFiz boom = new BoomFiz();
        String val = "";
        for(int i=0; i < 20; i++) {
            val = boom.boom(i);
            System.out.println(val);
        }
    }
}
