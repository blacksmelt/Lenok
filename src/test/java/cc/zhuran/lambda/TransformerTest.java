package cc.zhuran.lambda;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransformerTest {
	private List<Integer> numbers;
	private List<String> words;

	@Before
	public void before(){
		numbers = Lists.newArrayList(1, 2, 3, 4);
		words = Lists.newArrayList("a", "aB", "AbC", "ABCD", "12");
	}

	@Test
	public void shouldDoubleEveryNumberInList(){
		List<Integer> results = Transformer.transform(numbers, number -> number * 2);
		assertThat(results.equals(Lists.newArrayList(2, 4, 6, 8)), is(true));
	}

	@Test
	public void shouldTripleEveryNumberInList(){
		List<Integer> results = Transformer.transform(numbers, number -> number * 3);
		assertThat(results.equals(Lists.newArrayList(3, 6, 9, 12)), is(true));
	}

	@Test
	public void shouldUppercaseEveryStringInList(){
		List<String> results = Transformer.transform(words, word -> word.toUpperCase());
		assertThat(results.equals(Lists.newArrayList("A", "AB", "ABC", "ABCD", "12")), is(true));
	}
}
