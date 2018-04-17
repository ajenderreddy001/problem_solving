package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Thrid {
    public Thrid()
    {
        Integer[] n={99,102,-1,0,-87,2,5,7,3,4,2,1};
        List<Integer> list=Arrays.asList(n);
        //Arrays.sort(n);
        Collections.sort(list);
        for(int i:n)
        {
            System.out.print(i+" ");
        }
        for(Integer i:list)
        {
            System.out.print(i+" ");
        }
    }
}
