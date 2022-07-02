package elgrably_assignment;

import java.util.LinkedList;
import java.util.Queue;

public class minElementQueues {

    public static int minElementTwoQueues(Queue<Integer> q1, Queue<Integer>q2){
        int ans= -1;
        int minq1, minq2;
        minq1=q1.poll();
        minq2=q2.poll();

        while (!(q1.isEmpty() && q2.isEmpty()) && ans==-1){
            if (minq1>minq2){
                minq2= q2.poll();
            }
            else if (minq1<minq2){
                minq1= q1.poll();
            }
            else if (minq1==minq2){
                ans=minq1;
            }
        }
        // recollect the queues

        return ans;
    }



    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<Integer>();
        Queue<Integer> q2= new LinkedList<Integer>();

        q1.add(12);
        q1.add(20);
        q1.add(65);
        q1.add(70);
        q1.add(75);

        q2.add(3);
        q2.add(7);
        q2.add(13);
        q2.add(20);
        q2.add(47);
        q2.add(70);

        System.out.println(minElementTwoQueues(q1, q2));
    }
}
