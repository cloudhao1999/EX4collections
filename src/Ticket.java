import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Ticket {
/*
 * дһ��ͳ��ͶƱ��������3����ѡ�ˣ���10�˲μ�ѡ�٣�ÿ��ѡ��������������ѡ�˵ı�ţ�Ҫ�����������ѡ�˵ĵ�Ʊ����
��������������10��ѡ�����ύ�ĺ�ѡ�˱��
��������������ѡ�˱�ż���Ӧ�ĵ�Ʊ��*
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < 10; i++) {
	            Scanner scanner = new Scanner(System.in);
	            for (int j = 0; j < 2; j++) {
	                int num = scanner.nextInt();
	                if (map.containsKey(num)) {
	                    map.put(num, map.get(num) + 1);
	                } else {
	                    map.put(num, 1);
	                }
	            }
	        }
	        map.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
