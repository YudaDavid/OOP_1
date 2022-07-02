package Iterators;

import java.util.Iterator;

public class Question_1 {

    public static void remove(Iterable<Integer>it, int k){
        for (Iterator<Integer> iterator = it.iterator(); iterator.hasNext();){
            int x = iterator.next();
            if (x > k)
                iterator.remove();
        }

    }
}
