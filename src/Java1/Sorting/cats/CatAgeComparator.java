package Java1.Sorting.cats;

import java.util.Comparator;

public class CatAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }

        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
