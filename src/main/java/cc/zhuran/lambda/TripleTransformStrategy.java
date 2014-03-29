package cc.zhuran.lambda;

public class TripleTransformStrategy implements TransformStrategy {
	@Override
	public int apply(int number){
		return number * 3;
	}
}
