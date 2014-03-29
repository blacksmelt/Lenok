package cc.zhuran.lambda;

import com.google.common.collect.Lists;
import java.util.List;

public class Transformer {
	public static <T, R> List transform(List<T> numbers, TransformStrategy<T, R> transformStrategy) {
		List results = Lists.newArrayList();
		for (T number : numbers){
			results.add(transformStrategy.apply(number));
		}
		return results;
	}
}