package by.odinets.lambda5.streamlining;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Также вначале класса необходимо сделать статический импорт. 
 * Не забудьте его сделать заранее, поскольку Eclipse не выдает подсказок для статических методов, 
 * а все матчеры являются статическими методами. Так что без импорта всех методов вы не сможете с помощью Ctrl+Enter 
 * посмотреть подсказки.

Чтобы подсказки были, надо импортировать все matcher сразу, поставив звездочку:
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Streamlining {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		List<Integer> sameOrder = numbers.stream()
										 .collect(Collectors.toList());
		System.out.println("numbers :: " + numbers);
		System.out.println("sameOrder :: " + sameOrder);
		assertEquals(numbers, sameOrder);
		
		Set<Integer> numbers2 = new HashSet<>(Arrays.asList(4, 3, 2, 1));
		List<Integer> sameOrder2 = numbers2.stream()
										  .collect(Collectors.toList());
		System.out.println("numbers2 :: " + numbers2);
		System.out.println("sameOrder2 :: " + sameOrder2);
		//assertEquals(Arrays.asList(4, 3, 2, 1), sameOrder2);
		
		Set<Integer> numbers3 = new HashSet<>(Arrays.asList(4, 3, 2, 1));
		List<Integer> sameOrder3 = numbers3.stream()
										   .sorted()
										   .collect(Collectors.toList());
		System.out.println("numbers3 :: " + numbers3);
		System.out.println("sameOrder3 :: " + sameOrder3);
		assertEquals(Arrays.asList(1, 2, 3, 4), sameOrder3);
		
		System.out.println("-------------------------------------------");
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4);
		List<Integer> stillOrdered = numbers4.stream()
										  .map(x -> x + 1)
										  .collect(Collectors.toList());
		System.out.println("numbers4 :: " + numbers4);
		System.out.println("stilOrdered :: " + stillOrdered);
		assertEquals(Arrays.asList(2, 3, 4, 5), stillOrdered);
		
		Set<Integer> unordered = new HashSet<>(numbers4);
		List<Integer> stillUnordered = unordered.stream()
												.map(x -> x + 1)
												.collect(Collectors.toList());
		System.out.println("unordered :: " + unordered);
		System.out.println("stillUnordered :: " + stillUnordered);
		assertThat(stillUnordered, hasItem(2));
		assertThat(stillUnordered, hasItem(3));
		assertThat(stillUnordered, hasItem(4));
		assertThat(stillUnordered, hasItem(5));
	}

}
