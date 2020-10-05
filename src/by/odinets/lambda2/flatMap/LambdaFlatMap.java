package by.odinets.lambda2.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Assert;

public class LambdaFlatMap {

	public static void main(String[] args) {
		
		List<String> listOne = new ArrayList<>();
		List<String> listTwo = new ArrayList<>();
		List<String> listConcat = new ArrayList<>();
		for(String value : Arrays.asList("a", "b", "c")) {
			listOne.add(value);
		}
		for(String value : Arrays.asList("1", "2", "3")) {
			listTwo.add(value);
		}
		for(String elem : listOne) {
			listConcat.add(elem);
		}
		for(String elem : listTwo) {
			listConcat.add(elem);
		}
		System.out.println("listConcat :: " + listConcat);
		
		//lambda
		List<Integer> together = Stream.of(Arrays.asList(1,2), Arrays.asList(3,4))
									   .flatMap(numbers -> numbers.stream())
									   .collect(Collectors.toList());
		System.out.println("together :: " + together);
		Assert.assertEquals(Arrays.asList(1,2,3,4), together);
		Assert.assertEquals(Arrays.asList(3,3,3,3), together);
		
	}

}
