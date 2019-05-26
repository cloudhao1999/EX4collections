import java.util.Comparator;
public class StudentComparetor implements Comparator<Student3> {
	@Override
    public int compare(Student3 s1, Student3 s2) {
        if (s1.getId() != s2.getId()) {
            return s1.getId() > s2.getId() ? 1 : -1;
        }
        return 0;
    }
}
