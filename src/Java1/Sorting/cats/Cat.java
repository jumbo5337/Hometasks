package Java1.Sorting.cats;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // > 0  this > cat
    // 0 - равны
    // < 0  this < cat
    @Override
    public int compareTo(Cat cat) {
        if (this.name == cat.name) {
            return 0;
        }
        if (this.name == null) {
            return 1;
        }
        if (cat.name == null) {
            return -1;
        }
        return name.compareTo(cat.name);
    }
}

