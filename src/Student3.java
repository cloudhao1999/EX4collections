import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/*
 * 创建学生类，包含学号、姓名、综合测评总分，使
 * 用ArrayList保存学生对象。先对学生对象按综合测评总分升序排列，再使用
 * Iterator的next方法输出List中的元素。再按学生的学号从小到大排序，
 * 使用Iterator的forEachRemaining方法输出
--提示，将学生类实现Comparable接口，按学号排序采用自然排序。按综测排序
，采用指定比较器排序。
 */
public class Student3 implements Comparable<Student3>{
	 	private String name;
	 	private int s_id;
	    private double score;

	    public Student3(int id, String name, double score) {
	    	this.s_id = id;
	        this.name = name;
	        this.score = score;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getId() {
	        return s_id;
	    }
	    public void setId(int id) {
	        this.s_id = s_id;
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
	    	if(!(s instanceof Student3)) return false;
	    	Student3 student=(Student3)s;
	    	boolean result=false;
	    	if(this.name!=null) {
	    		result=this.name.equals(student.name);
	    	}else {
	    		result=false;
	    	}
	    	return result;
	    }
	    public int compareTo(Student3 s) {

	        if (!this.name.equals(s.name)) {
	            return this.name.compareTo(s.name);
	        }
	        return 0;
	    }
	    public int hashCode() {
	    	short areaCode=3;
			int result = Short.hashCode(areaCode);

	        short prefix=4;
			result = 31 * result + Short.hashCode(prefix);

	        short lineNum=5;
			result = 31 * result + Short.hashCode(lineNum);

	        return result;
	  
	    }
	    public String toString() {
	        return "Student{" +
	        		"学号为"+s_id+'\''+
	                " ,姓名为'" + name + '\'' +
	                ", 成绩为" + score +
	                '}';
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student3> list = new ArrayList<>();
        list.add(new Student3(1, "xyy", 90));
        list.add(new Student3(2, "wbw", 50));
        list.add(new Student3(3, "fyx", 60));
        list.add(new Student3(4, "rs", 40));
        // 按总分升序
        Collections.sort(list);
        Iterator<Student3> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");
        // 按学号升序
        //list.sort(new StudentComparetor());
        Iterator<Student3> iterator1 = list.iterator();
        iterator1.forEachRemaining(System.out::println);
	}
}
