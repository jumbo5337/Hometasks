package Java1.structure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray extends AbsStructure implements Iterable<Integer>{
       private int[] array;
       private int size;

       public DynamicArray(){
        array=new int[10];
       }

       public DynamicArray (int initialCapacity){
           if (initialCapacity<=0){
               initialCapacity=10;
           }
           this.array= new int[initialCapacity];
       }

    @Override
    public void add(int value) {
        if (array.length==size){
            int[] oldArray=array;
            array = new int[(int)(oldArray.length*1.5)];
            System.arraycopy(oldArray, 0, array, 0, size);
        }
        array[size++]=value;
    }


    @Override
    public void remove(int index) {
        if (index>size){
            throw new NoSuchElementException();
        } else if (index<=0) {
            throw new NoSuchElementException();
        } else {
            int[] oldArray=array;
            array = new int[(int)(oldArray.length)];
            System.arraycopy(oldArray,0,array,0,index--);
            System.arraycopy(oldArray,(index+1),array,index,size-index);
            size--;
        }

    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public String toString() {
        if (array.length==size){
            return Arrays.toString(array);
        } else {
            int[] printArr = new int[size];
            System.arraycopy(array, 0, printArr, 0, size);
            return Arrays.toString(printArr);
        }
    }

    public void sort(){
        int buff;
        boolean isSorted=false;
        while (!isSorted){
            isSorted=true;
            for (int i=0;i<size-1;i++){
                if (array[i]>array[i+1]){
                    isSorted=false;
                    buff=array[i];
                    array[i]=array[i+1];
                    array[i+1]=buff;
                }
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Integer>{
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public Integer next() {
            if (cursor >= size){
                throw new NoSuchElementException();
            } else {
                return array[cursor++];
            }
        }
    }
}
