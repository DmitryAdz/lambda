package by.odinets.lambda2.reduce;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import org.junit.Assert;

public class LanbdaReduce {

	public static void main(String[] args) {
		
		int acc = 0;
		for(Integer element : Arrays.asList(1, 2, 3)) {
			acc = acc + element;
		}
		Assert.assertEquals(6, acc);
		
		//lambda
		int sum1 = Stream.of(1,2,3,4)
						 .reduce(0, (accum, element) -> accum + element);
						
		Assert.assertEquals(10, sum1);
		System.out.println(" ::::::::::::::::::::::: ");
		Assert.assertEquals(6, sum1);
		//lambda
		BinaryOperator<Integer> accumulator = (accum, element) -> accum + element;
		int sum2 = accumulator.apply(accumulator.apply(accumulator.apply(0, 2), 3), 4);
		
		Assert.assertEquals(9, sum2);
		System.out.println(" ::::::::::::::::::::::: ");
		Assert.assertEquals(6, sum2);
	}

}
