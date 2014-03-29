package cc.zhuran.lambda;

public interface TransformStrategy<T> {
	public T apply(T object);
}
