package by.odinets.lambda2.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;

public class LambdaMap {

	public static void main(String[] args) {
		
		List<String> collected = new ArrayList<>();
		for(String str : Arrays.asList("a", "b", "hello")) {
			String upperCaseStr = str.toUpperCase();
			collected.add(upperCaseStr);
		}
		System.out.println("collected :: " + collected);
		
		//lambda
		List<String> collectedLambda = Stream.of("a", "b", "hello")
											 .map(string -> string.toUpperCase())
											 .collect(Collectors.toList());
		System.out.println("collectedLambda :: " + collectedLambda);
		Assert.assertEquals(Arrays.asList("A", "B", "HELLO"), collectedLambda);
		Assert.assertEquals(Arrays.asList("A", "C", "HELLO"), collectedLambda);
	}

}
