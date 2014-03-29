package cc.zhuran.lambda;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Function;

public class Transformer {
	public static <T, R> List transform(List<T> numbers, Function<T, R> function) {
		List results = Lists.newArrayList();
		for (T number : numbers){
			results.add(function.apply(number));
		}
		return results;
	}
}