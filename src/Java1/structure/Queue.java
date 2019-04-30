package Java1.structure;

import Java1.structure.Exceptions.EmptyQueueException;
import Java1.structure.Exceptions.QueueOverFlowException;

public class Queue {
    private List queue = new List();
    private int count=0;

    public void add() throws QueueOverFlowException {
        if (count==12) {
            throw new QueueOverFlowException();
        }
        queue.add(count);
        count++;
    }

    public void extract() throws EmptyQueueException {
        if (count==0){
            throw new EmptyQueueException();
        }
        queue.remove(1);
        count--;
    }
    public void print (){
        System.out.println(queue.toString());
    }


}

