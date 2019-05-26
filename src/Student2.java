import java.util.HashMap;
import java.util.Map;
public class Student2 {
/*
 * 2.每一个学生都有对应的归属地。??学生Student，地址String。??学生属性：姓名，年龄。
 * ?注意：姓名和年龄相同的视为同一个学生。?保证学生的唯一性。定义map容器，将学生作为键，地址作为值存入map。分别使用keySet与entrySet遍历map中元素
 */
	 private String name;
	    private int age;

	    public Student2(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    @Override
	    public boolean equals(Object s) {
	    	if(this==s) return true;
	    	if(!(s instanceof Student2)) return false;
	    	Student2 student=(Student2)s;
	    	boolean result=false;
	    	if(this.name!=null) {
	    		result=this.name.equals(student.name);
	    	}else {
	    		result=false;
	    	}
	    	return result;
	    }
	    public int compareTo(Student2 s) {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
