package cc.zhuran.lambda;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransformerTest {
	private List<Integer> numbers;

	@Before
	public void before(){
		numbers = Lists.newArrayList(1, 2, 3, 4);
	}

	@Test
	public void shouldDoubleEveryNumberInList(){
		assertThat(Transformer.transform(numbers).equals(Lists.newArrayList(2, 4, 6, 8)), is(true));
	}
}
