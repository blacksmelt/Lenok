package cc.zhuran.lambda;

import com.google.common.collect.Lists;
import java.util.List;

public class Transformer {
	public static <T> List transform(List<T> numbers, TransformStrategy<T> transformStrategy) {
		List results = Lists.newArrayList();
		for (T number : numbers){
			results.add(transformStrategy.apply(number));
		}
		return results;
	}
}