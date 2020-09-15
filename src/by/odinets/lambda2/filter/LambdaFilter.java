package by.odinets.lambda2.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Assert;

public class LambdaFilter {

	public static void main(String[] args) {
		
		List<String> beginWithNumbers = new ArrayList<>();
		for(String value : Arrays.asList("a", "1abc", "abc1")) {
			if(Character.isDigit(value.charAt(0))) {
				beginWithNumbers.add(value);
			}
		}
		System.out.println("beginWithNumbers :: " + beginWithNumbers);
		
		List<String> beginWithNumbers1 = Stream.of("a", "1abc", "abc1")
											   .filter(value -> Character.isDigit(value.charAt(0)))
											   .collect(Collectors.toList());
		System.out.println("beginWithNumbers1 :: " + beginWithNumbers1);
		Assert.assertEquals(Arrays.asList("1abc"), beginWithNumbers1);
		Assert.assertEquals(Arrays.asList("21abc"), beginWithNumbers1);
	}

}
