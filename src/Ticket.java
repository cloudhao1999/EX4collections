import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Ticket {
/*
 * 写一个统计投票程序。设有3个候选人，有10人参加选举，每个选举人输入两个候选人的编号，要求输出各个候选人的得票数。
输入描述：输入10个选举人提交的候选人编号
输出描述：输出候选人编号及对应的得票。*
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
