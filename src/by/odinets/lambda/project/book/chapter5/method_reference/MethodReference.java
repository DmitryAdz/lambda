package by.odinets.lambda.project.book.chapter5.method_reference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class MethodReference {

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
	List<Integer> sameOrder = numbers.stream()
									 .collect(Collectors.toList());
	
	Set<Integer> numbersSet = new HashSet<>(Arrays.asList(4, 3, 2, 1));
	List<Integer> sameOrderList = numbersSet.stream()
										 	.collect(Collectors.toList());
	
	Set<Integer> numbersSet2 = new HashSet<>(Arrays.asList(4, 3, 2, 1));
	List<Integer> sameOrderList2 = numbersSet2.stream()
										   	  .sorted()
										      .collect(Collectors.toList());
	
	List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
	List<Integer> stillOrdered = numbers2.stream()
										 .map(x -> x + 1)
										 .collect(Collectors.toList());
	
	Set<Integer> unordered = new HashSet<>(numbers2);
	List<Integer> stillUnordered = unordered.stream()
											.map(x -> x + 1)
											.collect(Collectors.toList());
	
	@Test
	public void compareList() {
		System.out.println("compareList() :: numbers :: " + numbers);
		System.out.println("compareList() :: sameOrder :: " + sameOrder);
		assertEquals(numbers, sameOrder);
	}
	
	@Test
	public void compareSet() {
		System.out.println("compareSet() :: numbersSet :: " + numbersSet);
		System.out.println("compareSet() :: sameOrderList :: " + sameOrderList);
		assertEquals(numbersSet, sameOrderList);
	}
	
	@Test
	public void compareSet2() {
		System.out.println("compareSet2() :: Arrays.asList(1, 2, 3, 4) :: " + Arrays.asList(1, 2, 3, 4));
		System.out.println("compareSet2() :: sameOrderList2 :: " + sameOrderList2);
		assertEquals(Arrays.asList(1, 2, 3, 4), sameOrderList2);
	}
	
	@Test
	public void compareList2() {
		System.out.println("compareList2() :: numbers2 :: " + numbers2);
		System.out.println("compareList2() :: stillOrdered :: " + stillOrdered);
		assertEquals(Arrays.asList(2, 3, 4, 5), stillOrdered);
	}
	
	@Test
	public void compareSet3() {
		System.out.println("compareSet3() :: unordered :: " + unordered);
		System.out.println("compareSet3() :: stillUnordered :: " + stillUnordered);
		assertThat(stillUnordered, hasItem(2));
		assertThat(stillUnordered, hasItem(3));
		assertThat(stillUnordered, hasItem(4));
		assertThat(stillUnordered, hasItem(5));
	}
}
