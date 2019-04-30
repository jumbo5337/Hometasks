package Java1.structure;

import Java1.structure.Exceptions.EmptyQueueException;
import Java1.structure.Exceptions.EmptyStackException;
import Java1.structure.Exceptions.QueueOverFlowException;
import Java1.structure.Exceptions.StackOverFlowException;

public class App {
    public static void main(String[] args) {

        ///// удаляем из structure
        DynamicArray arr = new DynamicArray();
        arr.add(8);
        arr.add(6);
        arr.add(10);
        arr.add(7);
        arr.add(9);
        arr.add(5);
        System.out.println(arr.toString());
        arr.remove(1);        // удаление элемента из массива
        System.out.println(arr.toString());
        arr.sort();
        System.out.println(arr.toString());

        List list = new List();
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        System.out.println(list.toString());
        list.remove(2);      // удаление из списка
        System.out.println(list.toString());
        /// демонстрация итератора
        for (int a: arr){
            System.out.println(a);
        }

        //// очередь и стек
          Stack stack = new Stack();
          Queue q = new Queue();
          try {         //
              stack.pull();
          } catch (EmptyStackException ex){
              System.out.println("Стек пуст");
          }

           try {         //
              q.extract();
          } catch (EmptyQueueException ex){
            System.out.println("Очередь пуста");
          }

        try {
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
        } catch (StackOverFlowException exc){
            System.out.println("Стек полон");
            stack.print();
        }

        try {
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
            q.add();
        }  catch (QueueOverFlowException exc){
            System.out.println("Очередь переполнена");
            q.print();
        }



    }
}
