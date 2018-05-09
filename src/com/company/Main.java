package com.company;

import com.company.leetcode.sort.largestNumber;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(decode("25114"));

    }
    public static int decode(String message){

        int msgLen=message.length();
        if (msgLen==0 || msgLen==1){
            return 1;
        }
        int count=0;
        if(message.charAt(msgLen-1)>'0')
            count=decode(message.substring(0,msgLen-1));

        if((message.charAt(msgLen-2)<'2')|| (message.charAt(msgLen-2)=='2' && message.charAt(msgLen-1)<7))
            count+=decode(message.substring(0,msgLen-2));

        return count;


    }
}
