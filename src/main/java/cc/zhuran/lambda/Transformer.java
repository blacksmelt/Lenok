package cc.zhuran.lambda;

import com.google.common.collect.Lists;
import java.util.List;

public class Transformer {
	public static List transform(List<Integer> numbers, TransformStrategy transformStrategy) {
		List<Integer> results = Lists.newArrayList();
		for (int number : numbers){
			results.add(transformStrategy.apply(number));
		}
		return results;
	}
}