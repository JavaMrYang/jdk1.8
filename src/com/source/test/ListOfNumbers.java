package com.source.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author LiuYang
 * @Date 2019/5/28/028  17:20
 * @Version 1.0
 **/
public class ListOfNumbers {
    private static List<Integer> numberList;
    private static final int SIZE=10;

    public ListOfNumbers(){
        numberList=new ArrayList<>(SIZE);
        for (int i=0;i<SIZE;i++){
            numberList.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {
        PrintWriter out=null;

        try {
            out=new PrintWriter(new FileWriter("out.txt"));
            for(int i = 0; i <SIZE; i ++){
                // get（int）方法抛出IndexOutOfBoundsException，必须捕获它。
                out.println("Value at："+ i +"="+numberList.get(i));
            }
        }finally {
            if(Objects.nonNull(out)){
                out.close();
            } else{
                out.print("printWriter no open");
            }

        }


    }
    public static void main(String[] args) throws IOException {
        ListOfNumbers numbers=new ListOfNumbers();
        numbers.writeList();
        ListOfNumbers.numberList.add(new Integer(2));
        ListOfNumbers.numberList.add(null);
        System.out.println(ListOfNumbers.numberList);
    }
}
