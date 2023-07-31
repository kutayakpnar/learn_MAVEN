package org.kutaydavon;

import java.util.ArrayList;
import java.util.List;

public class ArrayBag {

    List<Integer> bag=new ArrayList<>();

    //public ArrayBag(List<Integer>)
    public void getNumbers(List<Integer> array){
        this.bag=array;

    }
    public int getAverage(){
        int total=0;
        int index=0;

        for(int i:bag){
            total+=i;
            index++;
        }
        return total/index;
    }
}
