import java.util.HashSet;
import java.util.Set;

public class Student4 {
	private String name;
    private int age;

    public Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object s) {
    	if(this==s) return true;
    	if(!(s instanceof Student4)) return false;
    	Student4 student=(Student4)s;
    	boolean result=false;
    	if(this.name!=null) {
    		result=this.name.equals(student.name);
    	}else {
    		result=false;
    	}
    	return result;
    }
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Student4> set = new HashSet<>();
	        set.add(new Student4("°à³¤", 20));
	        System.out.println("------------");
	        set.add(new Student4("°à³¤", 20));
	        System.out.println("------------");
	        set.add(new Student4("Ð¦Ò÷Ò÷", 30));
	        System.out.println("------------");
	        set.add(new Student4("Ð¦Ò÷Ò÷", 20));
	}

}
