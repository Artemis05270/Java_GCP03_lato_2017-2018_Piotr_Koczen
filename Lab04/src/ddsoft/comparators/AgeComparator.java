package ddsoft.comparators;

import ddsoft.crawler.Student;

import java.util.Comparator;

public class AgeComparator  implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
