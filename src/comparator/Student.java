package comparator;

import java.util.Comparator;

public class Student {
    private String name;
    private int grade;

    private static final Comparator<String> BY_NAME = new BY_NAME();
    private static final Comparator<Integer> BY_GRADE = new BY_GRADE();

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    private static class BY_NAME implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }

    private static class BY_GRADE implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }
}
