package cc.zhuran.lambda;

public interface TransformStrategy<T, R> {
	public R apply(T object);
}
