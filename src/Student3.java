import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
