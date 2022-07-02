package Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {


    public static void main(String[] args) {
        // Question 1
        LinkedList<Integer> lst = new LinkedList<Integer>();
        lst.add(4);lst.add(2);lst.add(4);lst.add(4);
        Question_1.remove(lst, 3);
        System.out.println(lst);


        // Question 2
        MyCollection matrix = new MyCollection(3);
        matrix.put(1, 0, 0);
        matrix.put(2, 0, 1);
        matrix.put(3, 0, 2);
        matrix.put(4, 1, 0);
        matrix.put(5, 1, 1);
        matrix.put(6, 1, 2);
        matrix.put(7, 2, 0);
        matrix.put(8, 2, 1);
        matrix.put(9, 2, 2);



        for (int n: matrix){
            System.out.println(n);
        }
    }
}
