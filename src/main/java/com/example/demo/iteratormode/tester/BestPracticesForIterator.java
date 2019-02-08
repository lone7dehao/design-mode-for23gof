package main.java.com.example.demo.iteratormode.tester;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @ClassName: BestPracticesForIterator
 * @Description: 使用迭代器模式的最佳实践
 * @author lsq-pc
 * @date 2019年2月7日
 *
 */
public class BestPracticesForIterator {

	// 默认创建一个长度为16的map集合
	private Map<String, String> mapTestOne = new HashMap<String, String>();
	
	// 该代码块专门用来初始化mapTestOne
	{
		mapTestOne.put("one", 1 + "");
		mapTestOne.put("two", 2 + "");
		mapTestOne.put("three", 3 + "");
		mapTestOne.put("four", 4 + "");
		mapTestOne.put("five", 5 + "");
		mapTestOne.put("six", 6 + "");
		mapTestOne.put("seven", 7 + "");
		mapTestOne.put("eight", 8 + "");
		mapTestOne.put("nine", 9 + "");
		mapTestOne.put("ten", 10 + "");
	}
	
	public static void main(String[] args) {
		BestPracticesForIterator bestPracticesForIterator = new BestPracticesForIterator();
		Map<String, String> mapTestOne2 = bestPracticesForIterator.mapTestOne;
		//System.out.println(bestPracticesForIterator.mapTestOne);
		
//		for (Entry<String, String> entity : bestPracticesForIterator.mapTestOne.entrySet()) {
//			System.out.println(entity);
//		}
		
		Set<Entry<String,String>> entrySet = mapTestOne2.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next);
		}
	}
}
