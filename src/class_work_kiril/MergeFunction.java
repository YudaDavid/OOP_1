package class_work_kiril;

import java.util.LinkedList;
import java.util.List;

public class MergeFunction {

    // Complexity O(n)
    public static List<Element> merge(List<Element> list1, List<Element> list2){
        List<Element> ans = new LinkedList<Element>();
        int newIndex = 0;
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()){
            if (list1.get(i).letter < list2.get(j).letter){
                ans.add(list1.get(i));
                i++;
                newIndex++;
            }else {
                ans.add(list2.get(j));
                j++;
                newIndex++;
            }
        }

        while (i < list1.size()){
            ans.add(list1.get(i));
            i++;
            newIndex++;
        }
        while (j < list2.size()){
            ans.add(list1.get(j));
            j++;
            newIndex++;
        }

    return ans;

    }


    public static void main(String[] args) {
        List<Element> list1 = new LinkedList<Element>();
        List<Element> list2 = new LinkedList<Element>();

        list1.add(new Element('a', 3));
        list1.add(new Element('d', 5));
        list1.add(new Element('f',4));
        list1.add(new Element('g', 6));

        list2.add(new Element('b', 2));
        list2.add(new Element('c', 7));
        list2.add(new Element('e', 1));


        System.out.println(list1.size());

        System.out.println(merge(list1, list2));


    }
}
