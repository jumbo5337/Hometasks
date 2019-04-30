package Java1.Sorting;

import Java1.Sorting.cats.Cat;
import Java1.Sorting.cats.CatAgeComparator;
import Java1.Sorting.exceptions.NullLegthException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //// Сортировка пузырьком
        Integer[] arr={6,7,2,4,8,93,1234,53,675,4354,34234};
        System.out.println(Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Isya",11));
        cats.add(new Cat("Sonya",15));
        cats.add(new Cat("Joseph",2));
        cats.add(new Cat("Morris",19));
        cats.add(new Cat("Taskent",99));
        Cat[] catsArray = cats.toArray(new Cat[0]);

        BubbleSort.sort(catsArray, new CatAgeComparator());

        for (int i=0;i<catsArray.length;i++){
            System.out.println(catsArray[i].toString());
        }
        System.out.println(Arrays.toString(arr));


        // Сортировка слиянием
        Integer[] arr1={6,7,2,4,8,93,1234,53,675,4354,34234};
        MergeSort.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        List<Cat> cats1 = new ArrayList<>();
        cats.add(new Cat("Isya",11));
        cats.add(new Cat("Sonya",15));
        cats.add(new Cat("Joseph",2));
        cats.add(new Cat("Morris",19));
        cats.add(new Cat("Taskent",99));
        cats.add(new Cat("Hohol",404));
        cats.add(new Cat("Rotor",124));
        cats.add(new Cat("Div",92));
        cats.add(new Cat("Chert",9));
        cats.add(new Cat("Loh",59));
        cats.add(new Cat("Stahanov",9));


        Cat[] catsArray1 = cats.toArray(new Cat[0]);
         MergeSort.sort(catsArray1, new CatAgeComparator());
        for (int i=0;i<catsArray1.length;i++){
            System.out.println(catsArray1[i].toString());
        }


        ///Ловим исключения
        Integer[] emptyArr = new Integer[0];
        Cat[] dog = new Cat[0];
        try{
//            BubbleSort.sort(emptyArr);
//            BubbleSort.sort(dog, new CatAgeComparator());
//            MergeSort.sort(emptyArr);
//            MergeSort.sort(dog, new CatAgeComparator());
        } catch (NullLegthException exc){
            System.out.println("Массив пуст");
        }



    }

}
