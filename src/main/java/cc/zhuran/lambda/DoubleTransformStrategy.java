package cc.zhuran.lambda;

public class DoubleTransformStrategy implements TransformStrategy {
	@Override
	public int apply(int number) {
		return number * 2;
	}
}
