package by.odinets.lambda2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;

public class Lambda2 {

	public static void main(String[] args) {
		
		System.out.println("Lambda 2 ::");
		List<String> collected = Stream.of("a", "b", "c")
									   .collect(Collectors.toList());
		
		Assert.assertEquals(Arrays.asList("a", "b", "a"), collected);
		Assert.assertEquals(Arrays.asList("a", "b", "c"), collected);

	}

}
