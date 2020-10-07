package by.odinets.lambda4.optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

public class OptionalTesting {

	public static void main(String[] args) {
		
		Optional<String> a = Optional.of("a");
		System.out.println("a.get() :: " + a.get());
		assertEquals("a", a.get());
		assertTrue(a.isPresent());
		
		Optional emptyOptional = Optional.empty();
		//System.out.println("emptyOptional.get() :: " + emptyOptional.get());
		System.out.println("emptyOptional :: " + emptyOptional);
		assertFalse(emptyOptional.isPresent());
		assertEquals("b", emptyOptional.orElse("b"));
		System.out.println("emptyOptional.orElse(\"b\") :: " + emptyOptional.orElse("b"));
		assertEquals("c", emptyOptional.orElseGet(() -> "c"));
		System.out.println("emptyOptional.orElseGet(() -> \"c\" :: " + emptyOptional.orElseGet(() -> "c"));
		
		Optional alsoEmpty = Optional.ofNullable(null);
		//System.out.println("alsoEmpty.get() :: " + alsoEmpty.get());
		System.out.println("alsoEmpty :: " + alsoEmpty);
		System.out.println("alsoEmpty.orElse(\"b\") :: " + alsoEmpty.orElse("b"));
		assertFalse(alsoEmpty.isPresent());
		alsoEmpty = Optional.ofNullable("eee");
		System.out.println("alsoEmpty.get() :: " + alsoEmpty.get());
		
		
	}

}
