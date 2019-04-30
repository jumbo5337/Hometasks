package Java1.Sorting;

import Java1.Sorting.exceptions.NullLegthException;

import java.util.Comparator;

public class BubbleSort {

    public static void sort (Comparable[] array){
        if (array.length == 0){
            throw new NullLegthException();
        }
        Comparable buff;
        boolean isSorted=false;
        while (!isSorted){
            isSorted=true;
            for (int i=0;i<array.length-1;i++){
                if (array[i].compareTo(array[i+1])>0){
                    isSorted=false;
                    buff=array[i];
                    array[i]=array[i+1];
                    array[i+1]=buff;
                }
            }
        }
     }

    public static void sort (Object[] array, Comparator c){
        if (array.length == 0){
            throw new NullLegthException();
        } else if (array.length==1){
            return;
        }
        Object buff;
        boolean isSorted=false;
        while (!isSorted){
            isSorted=true;
            for (int i=0;i<array.length-1;i++){
                if(c.compare(array[i], array[i+1])> 0){
                   isSorted=false;
                    isSorted=false;
                    buff=array[i];
                    array[i]=array[i+1];
                    array[i+1]=buff;
                }
            }
        }





    }



}




