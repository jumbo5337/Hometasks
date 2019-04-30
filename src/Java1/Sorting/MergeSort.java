package Java1.Sorting;

import Java1.Sorting.exceptions.NullLegthException;

import java.util.Comparator;

public class MergeSort {

  public static void sort (Comparable[] arr) {
    if (arr.length == 0) {
           throw new NullLegthException();
        } else if (arr.length==1){
        return;
       }
        mergeAlg(arr, 0, arr.length);
    }

    public static void mergeAlg (Comparable[] dest, int low, int high){
      if (low+1<high){                   ///  проверяем размер массива <2
          int mid = (low + high) >>> 1;       /// находим середину
          mergeAlg(dest, low, mid);           ///рекурсивно вызываем сортирову половин массива
          mergeAlg(dest, mid, high);
          int size = high - low;
          Object[] buff = new Object[size]; /// создаём буфферный массив
          int i = low;         // курсор первой половины
          int j = mid;         // курсор второй половины
          for (int k = 0; k < size; k++) {       // заполняем массив
              if (j >= high || i < mid && dest[i].compareTo(dest[j])<0) {
                  buff[k] = dest[i++];
              } else {
                  buff[k] = dest[j++];
              }
          }
          System.arraycopy(buff, 0, dest, low, size);       // копируем значения буферного массива в сортируемый
      }
    }


    public static void sort (Object[] arr, Comparator c) {
        if (arr.length == 0) {
            throw new NullLegthException();
        } else if (arr.length==1){
            return;
        }
        mergeAlg(arr, 0, arr.length, c);
    }

    public static void mergeAlg (Object[] dest, int low, int high, Comparator c){
        if (low+1<high){
            int mid = (low + high) >>> 1;
            mergeAlg(dest, low, mid, c);
            mergeAlg(dest, mid, high, c);
            int size = high - low;
            Object[] buff = new Object[size];
            int i = low;
            int j = mid;
            for (int k = 0; k < size; k++) {
                if (j >= high || i < mid && c.compare(dest[i], dest[j])<0) {
                    buff[k] = dest[i++];
                } else {
                    buff[k] = dest[j++];
                }
            }
            System.arraycopy(buff, 0, dest, low, size);
        }
    }






}
