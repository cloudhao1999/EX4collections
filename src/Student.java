import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;
/*
 * 1.创建学生类，包含学号、姓名、综合测评总分。使用TreeSet保存学生对象，按测评总分排序。
 * 如果分数相同，按姓名排序。 最后再用迭代器输出学生对象。
 */
public class Student {
	private int s_id;
	private String name;
    private double score;
    public Student(int s_id, String name, double score) {
        this.s_id = s_id;
        this.name = name;
        this.score = score;
    }
    public int getId() {
        return s_id;
    }

    public void setId(int id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public boolean equals(Object s) {
    	if(this==s) return true;
    	if(!(s instanceof Student)) return false;
    	Student student=(Student)s;
    	if(Double.compare(student.score, this.score)!=0) {
    		return false;
    	}
    	if(this.s_id!=student.s_id) return false;
    	boolean result=false;
    	if(this.name!=null) {
    		result=this.name.equals(student.name);
    	}else {
    		result=false;
    	}
    	return result;
    }
    public int compareTo(Student s) {
    	if (this.score != s.score) {
            return this.score > s.score ? 1 : -1;
        }
        if (!this.name.equals(s.name)) {
            return this.name.compareTo(s.name);
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
