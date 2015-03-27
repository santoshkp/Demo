package com.spaneos.test;

public class LargestNumber
{
    static int getLLessThanN(int number, int digit)
    {
        //Converting digit to char
 
        char c = Integer.toString(digit).charAt(0);
 
        //Decrementing number & checking whether it contains digit
 
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                //If 'i' doesn't contain 'c'
 
                return i;
            }
        }
 
        return -1;
    }
 
    public static void main(String[] args)
    {
        System.out.println(getLLessThanN(123, 2));
 
        
    }
}
