import java.util.LinkedList;
public class StackTest<T> {
	//4.ʹ��LinkedList�ֱ�ʵ�ֶ��С���ջ(�Զ�����С���ջ�࣬��װLinkedList��)��
	private LinkedList<T> linkedList = new LinkedList<>();
    public void push(T obj) {
        linkedList.addFirst(obj);
    }
    public int size() {
        return linkedList.size();
    }
    public T pop() {
        return linkedList.removeFirst();
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StackTest<String> stackTest = new StackTest<>();
			stackTest.push("1");
			stackTest.push("1");
			stackTest.pop();
			stackTest.push("0");
			stackTest.push("1");
	        while (!stackTest.isEmpty()) {
	            System.out.println(stackTest.pop());
	        }
	}

}
