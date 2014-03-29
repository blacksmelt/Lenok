package cc.zhuran.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Transformer {
	public static <T, R> List transform(List<T> objects, Function<T, R> function) {
		return objects.stream().map(function).collect(Collectors.toList());
	}
}