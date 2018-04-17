package com.company;

import java.util.Scanner;

public class ClosestPalindrome {
    boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    StringBuffer makeAlmostPalindrome(StringBuffer buffer)
    {
        int evenFlag=1-buffer.length()%2;
        int upto=buffer.length()/2-evenFlag;
        for(int i=0;i<upto;i++)
        {
            buffer.setCharAt(buffer.length()-1-i,buffer.charAt(i));

        }
        return buffer;
    }
    StringBuffer setIndex(StringBuffer buffer,int index)
    {
        buffer.setCharAt(buffer.length()-1-index,buffer.charAt(index));
        return buffer;
    }
    public ClosestPalindrome()
    {
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        String orgNum=sc.next();
        StringBuffer buffer=new StringBuffer(orgNum);
        int length= orgNum.length();
        int evenFlag=1-length%2;
        if(isPalindrome(orgNum))
        {
            if(evenFlag==1)
            {
                buffer=setIndex(buffer,length/2-1);
            }
            else
            {
                buffer.setCharAt(length/2,(char) (((int)buffer.charAt(length/2))-1));
            }
        }
        else
        {
            buffer=makeAlmostPalindrome(buffer);
            if(evenFlag==1)
            {
                buffer=setIndex(buffer,length/2-1);
            }
            else
            {
                buffer.setCharAt(length/2,(char) (((int)buffer.charAt(length/2))-1));
            }
        }
        System.out.println(buffer);
    }
}
