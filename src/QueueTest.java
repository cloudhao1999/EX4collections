import java.util.LinkedList;
public class QueueTest<T> {
//4.ʹ��LinkedList�ֱ�ʵ�ֶ��С���ջ(�Զ�����С���ջ�࣬��װLinkedList��)��
	LinkedList<T> linkedList = new LinkedList<>();

    public void offer(T obj) {
        linkedList.addLast(obj);
    }
    public void clear() {
        linkedList.clear();
    }
    public int size() {
        return linkedList.size();
    }
    public T poll() {// ����
        return linkedList.removeFirst();
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueTest<String> queueTest = new QueueTest<>();
		queueTest.offer("s1");
		queueTest.offer("s2");
		queueTest.offer("s3");
        while (!queueTest.isEmpty()) {
            System.out.println(queueTest.poll());
        }
	}

}
